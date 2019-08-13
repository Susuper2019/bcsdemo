package cn.bcs.bean;


public class OrderItem {
	private Order Oid;
	private Product Pid;
	private int buynum;
	public Order getOid() {
		return Oid;
	}
	public void setOid(Order oid) {
		Oid = oid;
	}
	public Product getPid() {
		return Pid;
	}
	public void setPid(Product pid) {
		Pid = pid;
	}
	public int getBuynum() {
		return buynum;
	}
	public void setBuynum(int buynum) {
		this.buynum = buynum;
	}

}
