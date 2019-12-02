package cn.bcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.sun.org.apache.regexp.internal.recompile;

import cn.bcs.bean.Order;
import cn.bcs.bean.User;
import cn.bcs.utils.DataSourceUtils;

public class OrderDao {
	@Test
	public User selectUsers() {
		QueryRunner runner = new QueryRunner();
		String sql = "select *  from user where id=1";
		User user = null;
//		runner.query(DataSourceUtils.getConnection(), "select * from user", new ScalarHandler());
		try {
			user = (User)runner.query(DataSourceUtils.getConnection(),sql,new BeanHandler(User.class));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
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
