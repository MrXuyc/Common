package com.sunshine.common.entity;
/**
 * 
 * @author MrXuyc
 *
 */
public class User {
	/**
	 * 用户名称
	 */
	private String userName;
	/**
	 * 用户密码
	 */
	private String passWord;
	/**
	 * 账号
	 */
	private String userCode;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
	
}
