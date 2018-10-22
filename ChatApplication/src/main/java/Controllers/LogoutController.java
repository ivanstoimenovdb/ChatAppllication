package Controllers;

import Utility.JPAUtil;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutController extends ActionSupport{

	public String execute() {
		JPAUtil.close();
		return SUCCESS;
	}

}
