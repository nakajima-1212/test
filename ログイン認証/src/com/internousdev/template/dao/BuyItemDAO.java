package com.internousdev.template.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.ResultSet;
import com.internousdev.template.dto.BuyitemDTO;
import com.internousdev.template.util.DBConnector;

public class BuyItemDAO{
  private DBConnector dbConnector = new DBConnector();
  private Connection connection = dbConnector.getConnection();
  private BuyItemDTO buyItemDTO = new BuyItemDTO();
  
  public BuyItemDTO getBuyItemInfo(){
    String sql ="SELECT id,item_name,item_price FROM item_info_transaction";
    
    try{
      PreparedStatement preparedStatemen = connection.preparedStatment(sql);
      ResultSet resultSet = preparedStatement.executeQuery();
      if(resultSet.next()){
        buyItemDTO.setId(resultSet.getInt("id"));
        buyItemDTO.setItemName(resutSet.getString("item_name"));
        buyItemDTO.setItemPrice(resultSet.getString("item_price"));
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return buyItemDTO;
  }
  
  public BuyItemDTO getBuyItemDTO(){
    return buyItemDTO;
  }
}