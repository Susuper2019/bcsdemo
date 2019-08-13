package cn.bcs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import cn.bcs.bean.Order;
import cn.bcs.bean.User;
import cn.bcs.utils.DataSourceUtils;

public class OrderDao {
	/**
	 *  生成订单
	 * @param order
	 * @throws SQLException
	 */
	public void addProduct(Order order) throws SQLException {
		// 1.生成Sql语句
		String sql = "insert into orders values(?,?,?,?,?,?,0,null,?)";
		// 2.生成执行sql语句的QueryRunner,不传递参数
		QueryRunner runner = new QueryRunner();
        // 3.执行update()方法插入数据
		runner.update(DataSourceUtils.getConnection(), sql, order.getOid(),order.getOrdertime(),
				order.getTotal(),order.getState(), order.getAddress(), order
						.getName(), order.getTelePhone(), order
						.getUsername().getId());
	}
}
	/**
	 *  根据订单号修改订单状态
	 * @param id
	 * @throws SQLException
	 */
//	public void updateOrderState(String id) throws SQLException {
//		String sql = "update orders set paystate=1 where id=?";
//		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
//		runner.update(sql, id);
//		System.out.println(runner.update(sql, id));
//	}
//}
