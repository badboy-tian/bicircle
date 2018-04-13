package com.i7play.bicircle.bean;
public class Context  {
	
	public Object passport;
    
    public Context() {}
    public Context(Object passport) {
        this.passport = passport;
    
    }
    public Object getPassport() {
		return passport;
	}
	
    public void setPassport(Object passport) {
		this.passport = passport;
	}

    @Override
    public String toString() {
        return "Context{" +
                "passport=" + passport +
                '}';
    }
}