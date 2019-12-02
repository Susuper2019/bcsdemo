package cn.bcs.controller;

import java.sql.SQLException;

import cn.bcs.bean.Order;
import cn.bcs.bean.User;
import cn.bcs.dao.OrderDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hello.world");
	}
	@org.junit.Test
	public void run1() {
		OrderDao orderdao = new OrderDao();
		Order order = new Order();
		order.setAddress("河南");
		order.setOid("153");
		User user = orderdao.selectUsers();
		System.out.println(user);
		System.out.println("----------------------------");
		try {
			orderdao.addProduct(order);
			System.out.println("11");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
