package com.face.bo;

public class UserAccount {
	public static final String GENDER_MALE ="M";
    public static final String GENDER_FEMALE = "F";
     
    private String userName;

    private String password;
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
}