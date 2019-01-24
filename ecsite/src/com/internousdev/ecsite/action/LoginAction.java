package com.internousdev.ecsite.action;

import java.util.Map;
import java.util.Objects;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	public Map<String, Object>session;
	private LoginDAO loginDAO=new LoginDAO();
	private LoginDTO loginDTO=new LoginDTO();
	private BuyItemDAO buyItemDAO=new BuyItemDAO();

	public String execute(){
		String result=ERROR;
		loginDTO=loginDAO.getLoginUserInfo(loginUserId,loginPassword);
		session.put("loginUserInfo", loginDTO);



		/*if((((LoginDTO) session.get("loginUser")).getAdminFlg() != null)
		&& (((LoginDTO) session.get("loginUser")).getAdminFlg().equals("1")))
		完成例のコード*/

		if(Objects.equals(loginDTO.getAdmin_flg(),"1"))

		/*if(((LoginDTO)session.get("loginUserInfo")).getAdmin_flg()=="1")*
		 認識されずに商品購入に飛んでしまう。Stringは.equalメソッドで比較しなくてはだめ
		 * /

		/*if(loginDTO.getAdmin_flg().equals("1"))最初に書いた
		 * nullpointerのエラーコード*/{
			result="admin";
			return result;
		}else if(((LoginDTO)session.get("loginUserInfo")).getLoginFlg()==true){

			result=SUCCESS;
			BuyItemDTO buyItemDTO=buyItemDAO.getBuyItemInfo();
			session.put("login_user_id",loginDTO.getLoginId());
			session.put("id",buyItemDTO.getId());
			session.put("buyItem_name",buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());
			return result;
		}
		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
