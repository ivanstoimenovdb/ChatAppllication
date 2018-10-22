package Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.TableGenerator;

	/**************************************************
	 *      This class is responsible embeded key     *
	 *************************************************/

@Embeddable
public class userMessageId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/************************************************
	 *            Columns of UserMessageId          *
	 ***********************************************/
	
	// Column userId
	@Column(name = "userId")
	private Long userId;
	
	// Column messageId
	@Column(name = "messageId")
	private Long messageId;
	
	/***********************************************
	 *        Constructors of UserMessageId        *
	 **********************************************/
	
	// Default constructor
	public userMessageId() {
		super();
	}
	
	// Constructor with parameters
	public userMessageId(Long userId, Long messageId) {
		super();
		this.userId = userId;
		this.messageId = messageId;
	}
	
	/*************************************************
	 * 				Getters and setters
	 ***********************************************/
	
	//Getter of userId
	public Long getUserId() {
		return userId;
	}
	
	// Setter of UserId
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	// Getter of MessageId
	public Long getMessageId() {
		return messageId;
	}
	
	// Setter of messageId
	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		userMessageId other = (userMessageId) obj;
		if (messageId == null) {
			if (other.messageId != null)
				return false;
		} else if (!messageId.equals(other.messageId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "userMessageId [userId=" + userId + ", messageId=" + messageId + "]";
	}

}
