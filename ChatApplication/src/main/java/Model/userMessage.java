package Model;

import javax.persistence.Embedded;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.TableGenerator;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


/**********************************************************
 *     This class is responsible for Connection table     *
 *********************************************************/
@Entity(name = "userMsg")
@Table(name = "userMessage")
public class userMessage{

	/***************************************************
	 *        Columns of userMessage table             *
	 **************************************************/
	
	// Column userMessageId
	@EmbeddedId
	private userMessageId usermessageid;
	
	// Column user
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("userId")
	private User user;
	
	// Column message
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("messageId")
	private Message message;
	
	/*************************************************
	 *          Constructors of userMessage          *
	 ************************************************/
	
	// Default constructor
	public userMessage() {
		
	}

	// Constructor with parameters
	public userMessage(User user, Message message) {
		super();
		this.user = user;
		this.message = message;
	}

	/*************************************************
	 * 				Getters and Setters              *
	 ************************************************/
	
	// getter of userMessageId
	public userMessageId getUsermessageid() {
		return usermessageid;
	}

	// setter of userMessageId
	public void setUsermessageid(userMessageId usermessageid) {
		this.usermessageid = usermessageid;
	}

	// getter of User
	public User getUser() {
		return user;
	}

	// setter of User
	public void setUser(User user) {
		this.user = user;
	}

	// getter of Message
	public Message getMessage() {
		return message;
	}

	// setter of Message
	public void setMessage(Message message) {
		this.message = message;
	}
	
	/************************************************************
	 *         Hash code, toString and equals methods           *
	 ***********************************************************/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((usermessageid == null) ? 0 : usermessageid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		userMessage other = (userMessage) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (usermessageid == null) {
			if (other.usermessageid != null)
				return false;
		} else if (!usermessageid.equals(other.usermessageid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "userMessage [usermessageid=" + usermessageid + ", user=" + user + ", message=" + message + "]";
	}	
	
}
