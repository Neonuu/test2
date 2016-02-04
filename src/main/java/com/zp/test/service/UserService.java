package com.zp.test.service;

import java.util.List;
import java.util.Map;

import com.zp.test.entity.User;

public interface UserService {
	
    public List<User> selectUser(Map<String,Object> map);
    
    
}
