package com.ustglobal.dev.dao;

import com.ustglobal.dev.beans.User;

public interface UserInfoDao {
	public User getAllInfo();
	public void createProfile(User user);

}
