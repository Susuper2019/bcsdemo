package cn.bcs.bean;

public class User {
	private Integer id;
	private String user;
	private String password;
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", user=" + user + ", password=" + password + "]";
	}


	public static void main(String[] args) {
		User user = new User();
		user.id = 1;
		System.out.println(user);
	}
	    
}
