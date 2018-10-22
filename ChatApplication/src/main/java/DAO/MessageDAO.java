package DAO;

import java.util.Map;

import Model.Message;
import java.sql.SQLException;

public interface MessageDAO {
	
	void addMessage(Message message) throws SQLException;
	String getMessageByID(Message message, long id) throws SQLException;

}
