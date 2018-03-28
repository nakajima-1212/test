package com.internousdev.template.action;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dao.LoginDAO;
import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSUpport;

public class LoginAction extends ActionSupport implements SessionAware{
  
  private String loginUserId;
  private String loginPassword;
  private String result;
  public Map<String,Object>session;
  private LoginDAO loginDAO = newLoginDAO();
  private LoginDTO loginDTO = newLoginDTO();
  private ButItemDAO buyItemDAO = new BuyItemDAO();
  public String getLoginUserId(){
    return loginUserId;
  }
  
  public void setLoginUserId(String loginUserId){
    this.loginUserId = loginUserId;
  }
  
  public String getLoginPassword(){
    return loginPassword;
  }
  
  public void setLoginPasword(String liginPassword){
    this.loginPassword = loginPassword;
  }
  
  @Override
  public void setSession(Map<String,Object>session){
    this.session = session;
  
  public Stringexecute(){
    result = ERROR;
    loginDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);
    sesson.put("loginUser",loginDTO);
    
    if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
      result = SUCCESS;
      BuyItemDTO buyItemDTO =buyItemDAO.getBuyItemInfo();
      
      
      session.put("login_user_id",loginDTO.getLoginId());
      session.put("id",buyItemDTO.getId());
      session.put("buyItem_name",buyItemDTO.getItemNname());
      session("buyItem_prise",buyItemDTO.getItemPrice());
      
      return result;
      
    }
    return result;
  }
  }
}
