package com.cardspaly.web;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cardspaly.web.service.impl.TokenIpaddressServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class cardspalyApplicationTests {

	@Resource
	private TokenIpaddressServiceImpl tokenIpaddressService;
	@Test
	public void contextLoads() {
	}
	@Test
	public void checkForTokenTest() {
		
		int token = 767179282;
		String ip = "192.168.0.63";
		tokenIpaddressService.updateIpaddressByToken(token, ip);
		
		
	}

}
