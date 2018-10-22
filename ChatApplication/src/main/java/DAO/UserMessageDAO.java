package DAO;

import java.sql.SQLException;

import Model.*;

public interface UserMessageDAO {
	
	User getUserById(Long id) throws SQLException;
	Message getMessageById(Long Id) throws SQLException;
}
