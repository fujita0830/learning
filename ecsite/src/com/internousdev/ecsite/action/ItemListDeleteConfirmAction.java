package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteConfirmAction extends ActionSupport{

	private String itemListDeleteConfirmMessage;

	public String execute(){

		itemListDeleteConfirmMessage="すべての商品を削除します。よろしいですか？";

		return SUCCESS;
	}

	public String getItemListDeleteConfirmMessage() {
		return itemListDeleteConfirmMessage;
	}

	public void setItemListDeleteConfirmMessage(String itemListDeleteConfirmMessage) {
		this.itemListDeleteConfirmMessage = itemListDeleteConfirmMessage;
	}


}
