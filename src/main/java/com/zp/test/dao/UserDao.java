package com.zp.test.dao;

import java.util.List;
import java.util.Map;
import com.zp.test.entity.User;



public interface UserDao {
	
	public List<User> selectUser(Map<String,Object> map);   

}
