package com.i7play.bicircle.bean.resp;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class ToSpeak  {
	
	@SerializedName("type")
	@Expose
	public int type;
    
	@SerializedName("text")
	@Expose
	public String text;
    
    public ToSpeak() {}
    public ToSpeak(String text, int type) {
        this.text = text;
    
        this.type = type;
    
    }
    public String getText() {
		return text;
	}
	
    public void setText(String text) {
		this.text = text;
	}
    
    public int getType() {
		return type;
	}
	
    public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ToSpeak{" +
				"type=" + type +
				", text='" + text + '\'' +
				'}';
	}
}