package BeanClasses;

public class RegistrationClassInfo {
	
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String confirmpass;
	private String email;
	
	public RegistrationClassInfo() {
		super();
	}
	
	public RegistrationClassInfo(String firstName, String lastName, String userName, String password,
			String confirmpass, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.confirmpass = confirmpass;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpass() {
		return confirmpass;
	}
	public void setConfirmpass(String confirmpass) {
		this.confirmpass = confirmpass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
