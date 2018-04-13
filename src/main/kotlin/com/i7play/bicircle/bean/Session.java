package com.i7play.bicircle.bean;
public class Session  {
	
	public Object attributes;
    
	public String session_id;
    
	public Application application;
    
	public User user;
    
    public Session() {}

	public Session(Object attributes, String session_id, Application application, User user) {
		this.attributes = attributes;
		this.session_id = session_id;
		this.application = application;
		this.user = user;
	}

	public String getSessionId() {
		return session_id;
	}
	
    public void setSessionId(String session_id) {
		this.session_id = session_id;
	}
    
    public Object getAttributes() {
		return attributes;
	}
	
    public void setAttributes(Object attributes) {
		this.attributes = attributes;
	}
    
    public Application getApplication() {
		return application;
	}
	
    public void setApplication(Application application) {
		this.application = application;
	}
    
    public User getUser() {
		return user;
	}
	
    public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Session{" +
				"attributes=" + attributes +
				", session_id='" + session_id + '\'' +
				", application=" + application +
				", user=" + user +
				'}';
	}
}