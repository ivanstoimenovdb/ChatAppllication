package DAO;


public class UserDAOFactory {
	
	// Create such a object
	public static UserDAO getInstance() {
	
		return new UserDAOImpl();
	}

}
