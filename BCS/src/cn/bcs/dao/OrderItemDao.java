package cn.bcs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import cn.bcs.bean.Order;
import cn.bcs.bean.OrderItem;
import cn.bcs.bean.Product;
import cn.bcs.utils.DataSourceUtils;



public class OrderItemDao {

	// 添加订单项
	public void addOrderItem(Order order) throws SQLException {
		// 1.生成sql语句
		String sql = "insert into orderItem values(?,?,?)";

		QueryRunner runner = new QueryRunner();

		List<OrderItem> items = order.getOrderItems();

		Object[][] params = new Object[items.size()][3];

		for (int i = 0; i < params.length; i++) {
			params[i][0] = items.get(i).getOid().getOid();
			params[i][1] = items.get(i).getPid().getPid();
			params[i][2] = items.get(i).getBuynum();
		}

		runner.batch(DataSourceUtils.getConnection(), sql, params);
	}

	// 根据订单查找订单项.并将订单项中商品查找到。
	public List<OrderItem> findOrderItemByOrder(final Order order)
			throws SQLException {
		String sql = "select * from orderItem,Products where products.Pid=orderItem.Pid and Oid=?";

		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());

		return runner.query(sql, new ResultSetHandler<List<OrderItem>>() {
			public List<OrderItem> handle(ResultSet rs) throws SQLException {

				List<OrderItem> items = new ArrayList<OrderItem>();
				while (rs.next()) {
					OrderItem item = new OrderItem();

					item.setOid(order);
					item.setBuynum(rs.getInt("buynum"));

					Product p = new Product();
					p.setCid(rs.getString("category"));
					p.setPid(rs.getString("id"));
					p.setDescription(rs.getString("description"));
					p.setImgurl(rs.getString("imgurl"));
					p.setPname(rs.getString("name"));
					p.setPnum(rs.getInt("pnum"));
					p.setPrice(rs.getDouble("price"));
					item.setPid(p);

					items.add(item);
				}

				return items;
			}
		}, order.getOid());
	}
	//根据订单id删除订单项
//	public void delOrderItems(String id) throws SQLException {
//		String sql="delete from orderItem where order_id=?";
//		
//		QueryRunner runner=new QueryRunner();
//		
//		runner.update(DataSourceUtils.getConnection(),sql,id);
//	}
}
