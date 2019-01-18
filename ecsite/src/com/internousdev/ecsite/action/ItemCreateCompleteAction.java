package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction  extends ActionSupport
implements SessionAware{

	private Map<String, Object>session;

	public String execute() throws SQLException{

		ItemCreateCompleteDAO itemCreateCompleteDAO=new ItemCreateCompleteDAO();

		itemCreateCompleteDAO.createItem(session.get("createItemName").toString(),
		 session.get("createItemPrice").toString(),
		 session.get("createItemStock").toString());

		return SUCCESS;

	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
