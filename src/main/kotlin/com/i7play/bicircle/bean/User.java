package com.i7play.bicircle.bean;
public class User  {
	
	public String user_id;
    
	public String access_token;
    
    public User() {}
    public User(String access_token, String user_id) {
        this.access_token = access_token;
    
        this.user_id = user_id;
    
    }
    public String getAccessToken() {
		return access_token;
	}
	
    public void setAccessToken(String access_token) {
		this.access_token = access_token;
	}
    
    public String getUserId() {
		return user_id;
	}
	
    public void setUserId(String user_id) {
		this.user_id = user_id;
	}
    
}