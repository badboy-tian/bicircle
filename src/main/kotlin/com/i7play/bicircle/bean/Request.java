package com.i7play.bicircle.bean;

import java.math.BigInteger;

public class Request  {
	
	public boolean no_response;
    
	public int type;
    
	public String timestamp;
    
	public String locale;
    
	public String request_id;
    
	public Intent intent;
    
    public Request() {}

	public Request(boolean no_response, int type, String timestamp, String locale, String request_id, Intent intent) {
		this.no_response = no_response;
		this.type = type;
		this.timestamp = timestamp;
		this.locale = locale;
		this.request_id = request_id;
		this.intent = intent;
	}

	public String getLocale() {
		return locale;
	}
	
    public void setLocale(String locale) {
		this.locale = locale;
	}
    
    public String getRequestId() {
		return request_id;
	}
	
    public void setRequestId(String request_id) {
		this.request_id = request_id;
	}
    
    public int getType() {
		return type;
	}
	
    public void setType(int type) {
		this.type = type;
	}
    
    public String getTimestamp() {
		return timestamp;
	}
	
    public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
    
    public boolean getNoResponse() {
		return no_response;
	}
	
    public void setNoResponse(boolean no_response) {
		this.no_response = no_response;
	}


    public String getRequest_id() {
        return request_id;
    }



    public void setNo_response(boolean no_response) {
        this.no_response = no_response;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    @Override
    public String toString() {
        return "Request{" +
                "no_response=" + no_response +
                ", intent=" + intent +
                ", type=" + type +
                ", timestamp=" + timestamp +
                ", locale='" + locale + '\'' +
                ", request_id='" + request_id + '\'' +
                '}';
    }
}