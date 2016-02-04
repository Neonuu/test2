package com.zp.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zp.test.entity.User;
import com.zp.test.service.UserService;


@Controller
@RequestMapping("/userinfo")
public class UserController {
	
	  @Resource
	  private UserService us;
	
	  @RequestMapping(value="/{id}")
	  @ResponseBody
	  public List<User> test(@PathVariable Long id,HttpServletRequest request,HttpServletResponse response){
		  
		  System.out.println(id);
		  
		  Map<String,Object> paramMap=new HashMap<String,Object>();
		  paramMap.put("user_id", id);
		  List<User> ulist = us.selectUser(paramMap);
		  for(User u : ulist){
			  System.out.println(u.getUser_name());
		  }
		  return ulist;
	  }
      

}
