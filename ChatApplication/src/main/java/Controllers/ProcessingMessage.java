package Controllers;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.catalina.ha.deploy.UndeployMessage;

import com.opensymphony.xwork2.ActionSupport;
import com.pusher.rest.Pusher;

import BeanClasses.ProcessingInformationClass;
import DAO.MessageDAO;
import DAO.MessageDAOFactory;
import DAO.UserMessageDAO;
import DAO.UserMessageFactory;
import Model.Message;
import Model.User;
import Model.userMessage;

public class ProcessingMessage extends ActionSupport{
	ProcessingInformationClass processInfo = new ProcessingInformationClass();
	private Map <String, String> data = new LinkedHashMap<String, String>();
	User userObj = new User();
	Message msgObj = new Message();
	UserMessageDAO userMessageService = UserMessageFactory.getInstance();
	MessageDAO msgService = MessageDAOFactory.getInstance();
	
	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public String execute() throws NumberFormatException, SQLException {
		
		Pusher pusher = new Pusher ("610165","f9ee0bbcbb88171b126d","fa3df77af8e616e6fb09");
		pusher.setCluster("eu");
		pusher.setEncrypted(true);
		
		processInfo.setUniqueId(userObj.getId());
		processInfo.setMessage(userMessageService.getMessageById(processInfo.getUniqueId()).getMessageContent()) ;
		
		data.put("message", processInfo.getMessage());
		data.put("uniqueId", processInfo.getUniqueId().toString());
		pusher.trigger("FunChatApplication","sendMsg",data);
		return SUCCESS;
	}
	
	
}
