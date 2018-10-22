package DAO;



public class MessageDAOFactory {

	public static MessageDAO getInstance() {
		
		return new MessageDAOImpl();
	}
}
