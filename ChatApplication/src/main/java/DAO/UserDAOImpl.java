package DAO;

import java.sql.SQLException;

import java.util.List;
import javax.persistence.EntityManager;

import Model.Message;
import Model.User;

public class UserDAOImpl implements UserDAO {
	
	public  EntityManager em ;

	
	public Boolean login(String userName, String password) throws SQLException {
		String findUserName = em.find(User.class, userName).getUserName();
		String findPassword = em.find(User.class, userName).getPassword();
		
		if(findUserName.equals(userName) && findPassword.equals(password))
		{
			return true;
			
		}else {
		
		return false;
		}
	}

	public void CreateUser(User user) throws SQLException {
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
	}

	public User getUsersByName(String userName) throws SQLException {
		return em.find(User.class, userName);
	}

	public String getUsersMessage(User user) throws SQLException {
		return em.find(User.class, user).getMessages().toString();
	}

	public boolean hasAlreadySuchMail(String mail) throws SQLException {
		User userMail = em.find(User.class, mail);
		
		if(userMail == null) {
			return false;
			
		}else {
			
			return true;
		}
	}
	
	


}
