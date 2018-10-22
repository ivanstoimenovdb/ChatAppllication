package Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

 /*******************************************
 *                                          *
 *         Class creating user table        *
 *                                          *
 *******************************************/

@Entity
@Table(name = "user")
public class User{
	
	/*****************************************
	 *         Columns in class user          *
	 ****************************************/
	
	// id field of table user
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long id;
	
	// userName field of table user
	@Column(name = "userName")
	private String userName;
	
	// firstName field of table user
	@Column(name = "firstName")
	private String firstName;
	
	// lastName field of table user
	@Column(name = "lastName")
	private String lastName;
	
	// password field of table user
	@Column(name ="password")
	private String password;
	
	// email field of table user
	@Column(name = "Email")
	private String email;
	
	/****************************************
	 *     Many to Many table (connection)  *
	 *       interpretade as OneToMany      *
	 ***************************************/
	
	// Many to many relationship 
	@OneToMany(
			mappedBy = "user",
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	private Set<userMessage> message = new HashSet<userMessage>();
	
	 /*****************************************
	 *         Construtors of class user      *
	 *****************************************/
	
	// Default Contructor
	public User() {
		super();
	}
	
	// Construtor without messages and id
	public User(String userName, String firstName, String lastName, String password, String email) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}
	
	// Constructor without messages
	public User(Long id, String userName, String firstName, String lastName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}


	// Constructor with messages
	 public User(Long id, String userName, String firstName, String lastName, String password, String email,
			HashSet<userMessage> messages) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.message = messages;
	}

	/*****************************************
	 *          Creating of Column           *
	 ****************************************/
	
	// Creating colomn id that is auto increment 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	// Creating of colomn userName.
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	// Creating of colomn firstName
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// Creating of colomn lastName
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Creating of colomn password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// Creating of colomn email
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Creating getter and setter of message
	public Set<userMessage> getMessages() {
		return message;
	}
	public void setMessages(Set<userMessage> messages) {
		this.message = message;
	}
	
	/************************************************************
	 *         Hash code, toString and equals methods           *
	 ***********************************************************/
	
	// Hash code method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	
	// Equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}	
}
