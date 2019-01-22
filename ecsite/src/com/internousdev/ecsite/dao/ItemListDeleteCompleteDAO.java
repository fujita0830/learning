package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;


public class ItemListDeleteCompleteDAO {


	public int itemListDeleteComplete() throws SQLException{

		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();

		String sql="Delete from item_info_transaction";
		int result=0;


		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			result=preparedStatement.executeUpdate();


		}catch(Exception e){
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return result;
	}

}
