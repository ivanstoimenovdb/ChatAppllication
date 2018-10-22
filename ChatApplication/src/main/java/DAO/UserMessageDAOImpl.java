package DAO;

import java.sql.SQLException;

import javax.persistence.EntityManager;

import Model.Message;
import Model.User;
import Model.userMessage;

public class UserMessageDAOImpl implements UserMessageDAO{
	
	EntityManager em;
	
	@Override
	public User getUserById(Long MessageId) throws SQLException {
		return em.find(userMessage.class, MessageId).getUser();
	}

	@Override
	public Message getMessageById(Long UserId) throws SQLException {
		return em.find(userMessage.class, UserId).getMessage();
	}

}
