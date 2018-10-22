package Controllers;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import BeanClasses.RegistrationClassInfo;
import DAO.UserDAO;
import DAO.UserDAOFactory;
import DAO.UserDAOImpl;
import Model.User;

public class RegistrationController extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RegistrationClassInfo userRegInfo = new RegistrationClassInfo();
	User user = new User();
	UserDAO userService = UserDAOFactory.getInstance();
		
	public String execute() throws SQLException {
		
		
		if(userRegInfo.getPassword().equals(userRegInfo.getConfirmpass()))
		{
			user.setFirstName(userRegInfo.getFirstName());
			user.setLastName(userRegInfo.getLastName());
			user.setUserName(userRegInfo.getUserName());
			user.setPassword(userRegInfo.getPassword());
			user.setEmail(userRegInfo.getEmail());
			
			userService.CreateUser(user);
			return SUCCESS;
		}else {
			return ERROR;
		}
		
		
	}

}
