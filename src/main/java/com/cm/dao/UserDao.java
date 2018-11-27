package com.cm.dao;

import com.cm.model.UserModel;

import java.util.List;

public interface UserDao {
	List<UserModel> getAllUsers();

	UserModel getUser(int id);

	boolean addUser(UserModel userModel);

	boolean updateUser(String id, String name);

	boolean deleteUser(String id);
}
