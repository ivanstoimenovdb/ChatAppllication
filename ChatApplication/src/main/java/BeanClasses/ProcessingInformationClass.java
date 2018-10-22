package BeanClasses;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProcessingInformationClass {
	private String message;
	private Long uniqueId;
	
	
	public ProcessingInformationClass() {
		super();
	}
	
	public ProcessingInformationClass(String message, Long uniqueId) {
		super();
		this.message = message;
		this.uniqueId = uniqueId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(Long uniqueId) {
		this.uniqueId = uniqueId;
	}
	
}
