package com.ustglobal.dev.service;

import com.ustglobal.dev.beans.User;

public interface UserService {
	public User getAllInfo();
	public void createProfile(User user);
}
