package org.apache.struts2.ChatApp.action;

import java.util.LinkedHashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.pusher.rest.Pusher;

public class ProcessingMessage extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String message,uniqueId;
	private Map <String, String> data = new LinkedHashMap<String, String>();
	
	

	public String execute() {
		
		

		Pusher pusher = new Pusher ("610165","f9ee0bbcbb88171b126d","fa3df77af8e616e6fb09");
		pusher.setCluster("eu");
		pusher.setEncrypted(true);
		
		
		data.put("message", this.getMessage());
		data.put("uniqueId", this.getUniqueId());

		pusher.trigger("FunChatApplication","sendMsg",data);
		
		return SUCCESS;
	}
	
	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
}
