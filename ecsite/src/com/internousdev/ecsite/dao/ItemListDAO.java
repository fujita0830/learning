package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;


public class ItemListDAO {

	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	public ArrayList<ItemInfoDTO> getItemListDTOs() throws SQLException{

		ArrayList<ItemInfoDTO> itemListDTOs=new ArrayList<>();

		String sql="select*from item_info_transaction";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();

			while (resultSet.next()){
				ItemInfoDTO itemListDTO=new ItemInfoDTO();
				itemListDTO.setId(resultSet.getString("id"));
				itemListDTO.setItem_name(resultSet.getString("item_name"));
				itemListDTO.setItem_price(resultSet.getString("item_price"));
				itemListDTO.setItem_stock(resultSet.getString("item_stock"));
				itemListDTO.setInsert_date(resultSet.getString("insert_date"));
				itemListDTO.setUpdated_date(resultSet.getString("update_date"));
				itemListDTOs.add(itemListDTO);
			}

		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			connection.close();
		}

		return itemListDTOs;

	}


}
