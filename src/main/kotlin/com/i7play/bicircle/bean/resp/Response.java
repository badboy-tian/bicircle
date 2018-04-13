package com.i7play.bicircle.bean.resp;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Response  {
	@SerializedName("open_mic")
	@Expose
	public boolean open_mic;
    
	@SerializedName("to_display")
	@Expose
	public ToDisplay to_display;
    
	@SerializedName("to_speak")
	@Expose
	public ToSpeak to_speak;
    
    public Response(boolean open_mic, ToDisplay to_display, ToSpeak to_speak) {
        this.open_mic = open_mic;
    
        this.to_display = to_display;
    
        this.to_speak = to_speak;
    
    }
    public boolean getOpenMic() {
		return open_mic;
	}
	
    public void setOpenMic(boolean open_mic) {
		this.open_mic = open_mic;
	}
    
    public ToDisplay getToDisplay() {
		return to_display;
	}
	
    public void setToDisplay(ToDisplay to_display) {
		this.to_display = to_display;
	}
    
    public ToSpeak getToSpeak() {
		return to_speak;
	}
	
    public void setToSpeak(ToSpeak to_speak) {
		this.to_speak = to_speak;
	}

	@Override
	public String toString() {
		return "Response{" +
				"open_mic=" + open_mic +
				", to_display=" + to_display +
				", to_speak=" + to_speak +
				'}';
	}
}