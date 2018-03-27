package com.internousdev.util;
import java.sql.Connction;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector{
  private static String driverName ="com.mysql.jdbc.Driver";
  private static String url ="jdbc:mysql://localhost/ecsite";
  
  private static String user ="root";
  private static String password="mysql";
  
   public Connection getConnection(){
     connection con = null;
  
  try{
        class.forName(driverName);
        con =(Connection)DriverManager.getConnection(url,user,password);
  }catch(ClassNotFoundException e){
         e.printStackTrace();
    
  }catch(SQLException e){
         e.printStackTrace();
  }
     
  return con;
  }
  


}