package com.hdaerduo.wstest;

public class WiselyResponse {
	
	private String responseMessage;
	
	public WiselyResponse(String responseMessage){
		this.responseMessage=responseMessage;
	}
	
	public String getResponseMessage(){
		return this.responseMessage;
	}
	
	public void setResponseMessage(String responseMessage){
		this.responseMessage = responseMessage;
	}
}
