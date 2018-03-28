package com.internousdev.template.dao;

public class LoginDTO{
  
  private String loginId;
  private String loginPassword;
  private String userName;
  private boolean loginfig = false;
  
  public String getLoginId(){
    return loginId;
  }
  
  public void setLoginId(String loginId){
    this.loginId = loginId;
  }
  
  public String get LoginPassword(){
    return loginPassword;
  }
  public void setLoginPassword(String loginPassword){
    this.loginpassword = loginPassword;
  }
  public String getuserName(){
    return userName;
  }
  public void setUserName(String userName){
    this.userName = userName;
  }
  public String boolean getLoginFlg(){
    return loginFlg;
  }
  public void setLoginFlg(boolean loginFlg){
    this.loginFlg = loginFlg;
  }
}