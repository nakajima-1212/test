package com.internousdev.template.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;


public class UserCreateCompleteDAO{
  private DBConnector dbConnector = new DBConnector();

  private Connection connection = dbConnector.getConnection();

  private DateUtil dateUtil = new DateUtil();

  private String sql ="INSERT INTO login_user_transaction(login_id,login_pass,user_name,insertdate) VALUES(?,?,?,?)";

  public void createUser(String loginUserId,String loginUserPassword,String userName) throws SQLException{
    try{
      PreparedStatement preraredStatement = connection.prepareStatement(sql);
      preraredStatement.setString(1,loginUserId);
      preraredStatement.setString(2,loginUserPassword);
      preraredStatement.setString(3,userName);
      preraredStatement.setString(4,dateUtil.getDate());

      preraredStatement.execute();

    }catch(Exception e){
      e.printStackTrace();
    }finally{
      connection.close();
    }
  }
}