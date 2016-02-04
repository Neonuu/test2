package com.zp.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {
	
	  @RequestMapping("/test.do")
	  @ResponseBody
	  public Map<String,Object> test(){
		  System.out.println("测试");
		  String s = "ok";
		  Map<String,Object> resMap=new HashMap<String,Object>();
		  resMap.put("code", s);
		  return resMap;
	  }
      

}
