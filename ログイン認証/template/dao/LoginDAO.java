package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatrment;
import java.sql.ResultSet;
import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnevtor;

public class LoginDAO{
  private DBConnector dbConnector = new DBConnector();
  private Connection connection = dbConnector.getConnection();
  private LoginDTO LoginDTO();
  
  public LoginDTO getLoginUserInfo(String loginId,String loginPassword){
    String sql ="SELECT*FROM login_user_transaction where login_id = ? AND login_pass = ?";
    
    try{
      preparedStatement preparedStatement = connection.prepareStatement(sql);
      
      preparedStatemant.setString(1,loginUserId);
      preparedStatemant.setString(2,loginPassword);
      
      if(resultSet.next()){
        loginDTO.setLoginId(resultSet.getString("login_id"));
        loginDTO.setLoginPassword(resultSet.getString("login_pass"));
        loginDTO.setUserName(resultSet.getString("user_name"));
        
        if(!(resultSet.getString("login_id").equals(null))){
          loginDTO.setLoginFlg(true);
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return loginDTO;
  }
  public LoginDTO getLoginDTO(){
    return loginDTO;
  }
}