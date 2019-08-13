package cn.bcs.bean;


public class Product {
	private String Pid; // 商品编号
	private String Pname; // 名称
	private double price; // 价格
	private String Cid; // 分类
	private int Pnum; // 数量
	private String imgurl; // 图片路径
	private String description; // 描述
	public String getPid() {
		return Pid;
	}
	public void setPid(String pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCid() {
		return Cid;
	}
	public void setCid(String cid) {
		Cid = cid;
	}
	public int getPnum() {
		return Pnum;
	}
	public void setPnum(int pnum) {
		Pnum = pnum;
	}
	public String getImgurl_s() {
		int index = imgurl.lastIndexOf("."); // 得到最的.的索引
		String first = imgurl.substring(0, index);

		String last = imgurl.substring(index);

		return first + "_s" + last;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Pid == null) ? 0 : Pid.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Pid == null) {
			if (other.Pid != null)
				return false;
		} else if (!Pid.equals(other.Pid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [id=" + Pid + ", name=" + Pname + ", price=" + price
				+ ", category=" + Cid + ", pnum=" + Pnum + ", imgurl="
				+ imgurl + ", description=" + description + ", totalSaleNum="
				+ "]";
	}

	

}
