package com.cardspaly.web.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 * @author java1234 小锋 老师
 *
 */
public class StringUtil {

	/**
	 * 判断是否是空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if(str==null||"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 判断是否不是空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		if((str!=null)&&!"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	
    public static String delNull(Date date) {  
        String returnStr="";  
        if (date!=null) {  
            SimpleDateFormat sf=new SimpleDateFormat("yyyy年MM月");  
            returnStr=sf.format(date);    
        }   
        return returnStr;  
    }  
    public static String delNull(String str) {  
        String returnStr="";  
        if (StringUtils.isNotEmpty(str)) {  
            returnStr=str;        
        }   
        return returnStr;  
    }  
    
    public static Integer delNull( Integer intValue) {  
    	Integer returnInt=null;  
        if (intValue!=null) {  
        	returnInt=intValue;        
        }   
        return returnInt;  
    }  
    
    
    
    
    
    
	
}
