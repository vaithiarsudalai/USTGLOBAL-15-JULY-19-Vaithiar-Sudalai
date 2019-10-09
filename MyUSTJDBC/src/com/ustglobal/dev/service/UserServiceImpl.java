package com.ustglobal.dev.service;

import com.ustglobal.dev.beans.User;
import com.ustglobal.dev.dao.UserInfoDaoImpl;

public class UserServiceImpl implements UserService {

	UserInfoDaoImpl uid = new UserInfoDaoImpl(); 
	@Override
	public User getAllInfo() {
		return uid.getAllInfo();
	}

	@Override
	public void createProfile(User user) {
		uid.createProfile(user);		
	}

}
