package cn.bcs.bean;

public class User {
	private int id; // 用户编号
	private String username; // 用户姓名
	private String password; // 用户密码
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + "]";
	}
}
