package com.internousdev.ecsite.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.UserInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserListDAO {

	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private ArrayList<UserInfoDTO>userList=new ArrayList<UserInfoDTO>();


	public  ArrayList<UserInfoDTO> getuserList() throws SQLException{

		String sql="select*from login_user_transaction";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();

			while(resultSet.next()){
				UserInfoDTO userListDTO=new UserInfoDTO();
				userListDTO.setId(resultSet.getString("id"));
				userListDTO.setLogin_id(resultSet.getString("login_id"));
				userListDTO.setLogin_pass(resultSet.getString("login_pass"));
				userListDTO.setUser_name(resultSet.getString("user_name"));
				userListDTO.setInsert_date(resultSet.getString("insert_date"));
				userListDTO.setUpdated_date(resultSet.getString("updated_date"));
				userList.add(userListDTO);
			}

		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			connection.close();
		}

		return userList;

	}

}
