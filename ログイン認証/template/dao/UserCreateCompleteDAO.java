package com.internousdev.template.dao;
import java.sql.Connection;
import java.sql.PreraredStatement;
import java.sql.SQLException;
import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;


public class UserCreateCompleteDAO{
  private DBConnector dbConnector = newDBConnector();
  
  private Connection connection = dbconnector.getConnection();
  
  private DateUtil dateUtil = new DateUtil();
  
  private Strin sql ="INSERT INTO login_user_transaction(login_id,login_pass,user_name,insertdate) VALUES(?,?,?,?)";
  
  public void createUser(String loginUserId,String loginUserPassword,String useName) throws SQLException{
    try{
      PreparedStatement preraredDtatement = connection.preraredStatment(sql);
      preparedStatement.setString(1,loginUserId);
      preparedStatement.setString(2,loginUserPassword);
      preparedStatement.setString(3,userName);
      preparedStatement.setString(4,dateUtil.getDate());
      
      preparedstatement.execute();
      
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      connection.close();
    }
  }
}