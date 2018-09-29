package com.cardspaly.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Project: cardspaly
 * @Description 首页或者权限url跳转控制器
 * @author silence
 * @date 2018年9月25日
 * @version V1.0
 */
@Controller
public class IndexController {

	
    /**
     * 网站根目录请求
     * @return
     */
    @RequestMapping("/")
    public String root() {
    	return "redirect:/login.html";
    }
    
 
}
