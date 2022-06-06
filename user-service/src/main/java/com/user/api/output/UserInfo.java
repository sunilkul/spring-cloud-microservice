package com.user.api.output;

public class UserInfo {

	private Integer userId;
	private String userName;
	private Double salary;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public UserInfo() {
	}

	public UserInfo(Integer userId, String userName, Double salary) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", salary=" + salary + "]";
	}

}
