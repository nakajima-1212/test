package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;

public class BuyItemCompleteDAO {

  private DBConnector dbconnection = new DBConnector();
  private Connection connection= dbconnection.getConnection();
  private DateUtil dateUtil = new DateUtil();

  private String sql = "INSERT INTO user_buy_item_transaction(item_transaction_id,total_pricde,total_count,user_master_id,pay,insert_date)VALUES(?,?,?,?,?,?)";

  public void buyItemInfo(String item_transaction_id,String user_master_id,String total_price,String total_count,String pay)throws SQLException{

    try{
      PreparedStatement preperedStatement = connection.prepareStatement(sql);
      preperedStatement.setString(1,item_transaction_id);
      preperedStatement.setString(2,total_price);
      preperedStatement.setString(3,total_count);
      preperedStatement.setString(4,user_master_id);
      preperedStatement.setString(5,pay);
      preperedStatement.setString(6,dateUtil.getDate());

      preperedStatement.execute();
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      connection.close();
    }
  }
}