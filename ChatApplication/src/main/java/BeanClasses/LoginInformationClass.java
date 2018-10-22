package BeanClasses;

public class LoginInformationClass {
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	
	public LoginInformationClass() {
		super();
	}

	public LoginInformationClass(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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
	
	
}
