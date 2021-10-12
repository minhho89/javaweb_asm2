package beans;

import java.io.Serializable;

public class User implements Serializable {
	
	private String userName;
	private String password;
	private int role;
	private String name, address, phone;
	private int check;
	
	
	public User() {
		super();
		this.userName = "";
		this.password = "";
		this.role = -1;
		this.name = "";
		this.address = "";
		this.phone = "";
	}
	
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	

	public User(String userName, String password, int role, String name, String address, String phone, int check) {
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.check = check;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}
	
	

}
