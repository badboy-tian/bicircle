package com.i7play.bicircle.bean;
public class Intent  {
	
	public boolean is_direct_wakeup;
    
    public Intent() {}
    public Intent(boolean is_direct_wakeup) {
        this.is_direct_wakeup = is_direct_wakeup;
    
    }
    public boolean getIsDirect_wakeup() {
		return is_direct_wakeup;
	}
	
    public void setIsDirect_wakeup(boolean is_direct_wakeup) {
		this.is_direct_wakeup = is_direct_wakeup;
	}
    
}