package DAO;

public class UserMessageFactory {

	public static UserMessageDAO getInstance() {
		return new UserMessageDAOImpl();
	}
}
