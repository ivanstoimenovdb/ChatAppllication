package DAO;

import java.sql.SQLException;
import java.util.List;

import Model.User;
import Model.Message;

	/**********************************************************
	 *       This interface holds user CRUD operations		  *
	 *********************************************************/

public interface UserDAO {
	
	// Login method for user
	Boolean login(String userName, String password) throws SQLException;
	
	// Registraion user
	void CreateUser (User user) throws SQLException;
	
	// Get users by its id
	User getUsersByName(String userName) throws SQLException;
	
	// Get user message by user
	String getUsersMessage (User user) throws SQLException;
	
	// Checks is it already has such mail
	boolean hasAlreadySuchMail (String mail) throws SQLException;
}
