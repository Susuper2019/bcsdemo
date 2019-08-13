package cn.bcs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.bcs.bean.OrderItem;

public class Order {
	private String Oid; // �������
	private Date ordertime; // �µ�ʱ��
	private double total; // �����ܼ�
	private int state; // ����״̬
	private String address; // �ͻ���ַ
	private String name; // �ջ�������
	private String telePhone; // �ջ��˵绰
	private User username; // ���������û�
	
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
