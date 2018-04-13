package com.i7play.bicircle.bean.resp;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class AIResp  {
    
	@SerializedName("issessionend")
	@Expose
	public boolean issessionend;
    
	@SerializedName("version")
	@Expose
	public String version;
    
	@SerializedName("sessionattributes")
	@Expose
	public Object sessionattributes;
    
	@SerializedName("response")
	@Expose
	public Response response;
    
    public AIResp(boolean  issessionend, Response response, String version, Object sessionattributes){
        this.issessionend = issessionend;
    
        this.response = response;
    
        this.version = version;
    
        this.sessionattributes = sessionattributes;
    
    }
    public String getVersion() {
		return version;
	}
	
    public void setVersion(String version) {
		this.version = version;
	}
    
    public Object getSessionAttributes() {
		return sessionattributes;
	}
	
    public void setSessionAttributes(Object sessionattributes) {
		this.sessionattributes = sessionattributes;
	}
    
    public boolean getIsSessionend() {
		return issessionend;
	}
	
    public void setIsSessionend(boolean issessionend) {
		this.issessionend = issessionend;
	}
    
    public Response getResponse() {
		return response;
	}
	
    public void setResponse(Response response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "AIResp{" +
				"issessionend=" + issessionend +
				", version='" + version + '\'' +
				", sessionattributes=" + sessionattributes +
				", response=" + response +
				'}';
	}
}