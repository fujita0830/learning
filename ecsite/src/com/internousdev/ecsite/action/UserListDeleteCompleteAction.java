package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport{

	public String execute() throws SQLException{

		UserListDeleteCompleteDAO userListDeleteCompleteDAO=new UserListDeleteCompleteDAO();

		userListDeleteCompleteDAO.userListDeleteComplete();

		return SUCCESS;
	}

}
