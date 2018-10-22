package Controllers;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import BeanClasses.LoginInformationClass;
import DAO.UserDAO;
import DAO.UserDAOFactory;
import DAO.UserDAOImpl;

public class LoginController extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private LoginInformationClass userInfo = new LoginInformationClass();
	private UserDAO user = UserDAOFactory.getInstance();
	
	public LoginInformationClass getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(LoginInformationClass userInfo) {
		this.userInfo = userInfo;
	}
	public UserDAO getUser() {
		return user;
	}
	public void setUser(UserDAO user) {
		this.user = user;
	}

	
	public String execute() throws SQLException {
		
		 if(user.login(userInfo.getUserName(), userInfo.getPassword())!=null) {
			 return SUCCESS;
		 }else {
			 return ERROR;
		 }

	}
}
