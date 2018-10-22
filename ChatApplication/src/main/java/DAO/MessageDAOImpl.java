package DAO;

import java.util.Map;

import javax.persistence.EntityManager;

import Model.Message;
import Model.User;

public class MessageDAOImpl implements MessageDAO {
	
	public EntityManager em;
	public User user;
	
	@Override
	public void addMessage(Message message) {
		em.getTransaction().begin();
		em.persist(message);
		em.getTransaction().commit();
		em.close();
	}
	
	@Override
	public String getMessageByID(Message message, long id) {
		return em.find(Message.class, id).toString();
	}



	

}
