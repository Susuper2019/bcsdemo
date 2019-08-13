package cn.bcs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.itcast.itcaststore.domain.OrderItem;

public class Order {
	private String Oid; // 订单编号
	private Date ordertime; // 下单时间
	private double total; // 订单总价
	private int state; // 订单状态
	private String address; // 送货地址
	private String name; // 收货人姓名
	private String telePhone; // 收货人电话
	private User username; // 订单所属用户
	
	private List<OrderItem> orderItems = new ArrayList<OrderItem>();
	
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	public String getOid() {
		return Oid;
	}
	public void setOid(String oid) {
		Oid = oid;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelePhone() {
		return telePhone;
	}
	public void setTelePhone(String telePhone) {
		this.telePhone = telePhone;
	}
	public User getUsername() {
		return username;
	}
	public void setUsername(User username) {
		this.username = username;
	}
	public String toString() {
		return "Order [id=" + Oid + ", money=" + total + ", receiverAddress="
				+ address + ", receiverName=" + name
				+ ", receiverPhone=" + telePhone + ", paystate=" + state
				+ ", ordertime=" + ordertime + ", user=" + username
				+ ", orderItems=" + orderItems + "]";
	}
	

}
