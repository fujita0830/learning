package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;


public class UserListDeleteConfirmAction extends ActionSupport{

	private String userListDeleteConfirmMessage;



	public String execute(){

		userListDeleteConfirmMessage="すべてのユーザーを削除します。よろしいですか？";

		return SUCCESS;
	}

	public String getUserListDeleteConfirmMessage() {
		return userListDeleteConfirmMessage;
	}

	public void setUserListDeleteConfirmMessage(String userListDeleteConfirmMessage) {
		this.userListDeleteConfirmMessage = userListDeleteConfirmMessage;
	}

}
