package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class ItemCreateConfirmAction extends ActionSupport implements SessionAware {

	private String createItemName;
	private String createItemPrice;
	private String createItemStock;
	private Map<String, Object>session;
	private String errorMessage;

	public String execute(){

		String result=SUCCESS;

		if(!(createItemName.equals(""))
			&&!(createItemPrice.equals(""))
			&&!(createItemStock.equals(""))){
			session.put("createItemName", createItemName);
			session.put("createItemPrice", createItemPrice);
			session.put("createItemStock", createItemStock);

			try {
				Integer.parseInt(createItemPrice);
				Integer.parseInt(createItemStock);
			}catch (NumberFormatException e) {
				setErrorMessage("値段または在庫に数値以外が入力されています");
				result = ERROR;
			}
		}else{
			setErrorMessage("未入力の項目があります。");
			result=ERROR;
		}


		return result;
	    }

	public String getCreateItemName() {
		return createItemName;
	}

	public void setCreateItemName(String createItemName) {
		this.createItemName = createItemName;
	}

	public String getCreateItemPrice() {
		return createItemPrice;
	}

	public void setCreateItemPrice(String createItemPrice) {
		this.createItemPrice = createItemPrice;
	}

	public String getCreateItemStock() {
		return createItemStock;
	}

	public void setCreateItemStock(String createItemStock) {
		this.createItemStock = createItemStock;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}





}
