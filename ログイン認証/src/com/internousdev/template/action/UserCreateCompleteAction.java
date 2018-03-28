package com.internousdev.template.action;
import java.sql.SQLException;
import java.util.Map;
import org.apache.struts.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.internousdev.template.dao.UserCreateCompretetDAO;


public class UserCreateCompleteAction extends ActionSupport implements Sessionaware{
  
  private String loginUserId;
  private String loginPassword;
  private String userName;
  public Map<String,Object> session;
  private UserCreateCompleteDAO = new UserCreateComleteDAO();
  
  public String execute() throw SQLException{
    userCreateCompleteDAO.cerateUser(session.get("loginUserId").toString(),
                                    session.get("loginPassword").toString(),
                                    session.get("userName").toString());
    
    String result= SUCCESS;
    
    return result;
  }
  
  public String getLoginUserId(){
    return loginUserId;
  }
  public void setLoginUserOd(String loginUserId){
    this.loginUsrId = loginUserID;
  }
  
  public String getLoginUserPassword(){
    return loginPassword;
  }
  public void setLoginPassword(String loginPassword){
    this.loginPassword = loginPassword;
  }
  
  public String getUserName(){
    return userName;
  }
  public setUserName(String userName){
    this.userName = userName;
  }
  @Override
  public void setSession(Map<Strind,Object> sesson){
    this.session = session;
  }
}