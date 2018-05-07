package com.sanbhu.api.clicktime.bo;

public class UserSession {
	private String CompanyID;
	private String Token;
	private String UserEmail;
	private String UserName;
	private String SecurityLevel;
	private String UserID;
	
	public String getCompanyID() {
		return CompanyID;
	}
	
	public void setCompanyID(String companyID) {
		CompanyID = companyID;
	}
	
	public String getToken() {
		return Token;
	}
	
	public void setToken(String token) {
		Token = token;
	}
	
	public String getUserEmail() {
		return UserEmail;
	}
	
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	
	public String getUserName() {
		return UserName;
	}
	
	public void setUserName(String userName) {
		UserName = userName;
	}
	
	public String getSecurityLevel() {
		return SecurityLevel;
	}
	
	public void setSecurityLevel(String securityLevel) {
		SecurityLevel = securityLevel;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}
}
