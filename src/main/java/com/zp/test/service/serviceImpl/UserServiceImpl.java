package com.zp.test.service.serviceImpl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.zp.test.dao.UserDao;
import com.zp.test.entity.User;
import com.zp.test.service.UserService;



@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao ud;


	@Override
	public List<User> selectUser(Map<String, Object> map) {
		
		return ud.selectUser(map);
	}
	

	
	

}
