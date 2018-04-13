package com.i7play.bicircle.bean;
public class AIReq  {
    
	public double version;
    
	public String query;
    
	public Request request;
    
	public Session session;
    
	public Context context;
    
    public AIReq() {}
    public AIReq(Request request, Session session, String query, Context context, double version){
        this.request = request;
    
        this.session = session;
    
        this.query = query;
    
        this.context = context;
    
        this.version = version;
    
    }
    public String getQuery() {
		return query;
	}
	
    public void setQuery(String query) {
		this.query = query;
	}
    
    public double getVersion() {
		return version;
	}
	
    public void setVersion(double version) {
		this.version = version;
	}
    
    public Request getRequest() {
		return request;
	}
	
    public void setRequest(Request request) {
		this.request = request;
	}
    
    public Session getSession() {
		return session;
	}
	
    public void setSession(Session session) {
		this.session = session;
	}
    
    public Context getContext() {
		return context;
	}
	
    public void setContext(Context context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "AIReq{" +
				"version=" + version +
				", query='" + query + '\'' +
				", request=" + request +
				", session=" + session +
				", context=" + context +
				'}';
	}
}