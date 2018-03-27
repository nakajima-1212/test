package com.internousdev.template.util;

import java.text.SimpuleDateFormat;
import java.util.Date;

public class Dateutil{
  
  public String getDate(){
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/mm/ddHH:mm:ss");
    
    return simpleDateFormat(date);
  }
}