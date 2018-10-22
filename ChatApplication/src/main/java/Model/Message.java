package Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * 
 * @author Stoimenov
 *
 */

/********************************************************
 *    This class is responsible for table ""Message"    *
 *******************************************************/

@Entity(name = "Message")
@Table(name = "message")
public class Message{
	
	/***********************************************
	 *		    Columns in table of message         *
	 **********************************************/
	
	// Id of message – field of table message
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Id")
	private long id;
	
	// Message content – field of table message
	@Column(name = "messageContent")
	private String messageContent;

	

	/****************************************
	 *     One to Many table (mapping)      *
	 *     	  Many to many connectio        *
	 ***************************************/
	
	@OneToMany(
			mappedBy = "message",
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	private Set<userMessage> user = new HashSet<userMessage>();
	
	
	/*****************************************
	 *         Construtors of class user     *
	 ****************************************/
	
	// Default constructor
	public Message() {
	}

	// Constructor without id
	public Message(String messageContent) {
		super();
		this.messageContent = messageContent;
	}
	
	
	// Constructor with id 
	public Message(long id, String messageContent) {
		super();
		this.id = id;
		this.messageContent = messageContent;
	}

	// Constructor with id and users
	public Message(long id, String messageContent, HashSet<userMessage> user) {
		super();
		this.id = id;
		this.messageContent = messageContent;
		this.user = user;
	}

	/*****************************************
	 *   Creating of getters and setters     *
	 ****************************************/
	
	// Creating getters and setters of Id of message
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	// Creating getters and setters of Message Content
	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	
	// Creating getter and setter of users
	public Set<userMessage> getUser() {
		return user;
	}

	public void setUser(Set<userMessage> users) {
		this.user = users;
	}
	
	/************************************************************
	 *         Hash code, toString and equals methods           *
	 ***********************************************************/
	
	// HashCode method – it turns fields to hash code;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((messageContent == null) ? 0 : messageContent.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
	
	// equals method – it checks that object is created;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		if (id != other.id)
			return false;
		if (messageContent == null) {
			if (other.messageContent != null)
				return false;
		} else if (!messageContent.equals(other.messageContent))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
}
