package com.cm.service;

import com.cm.dao.UserDao;
import com.cm.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao userDao;

	public List<UserModel> getAllUsers(){
		return userDao.getAllUsers();
	}

	public UserModel getUser(int id) {
		return userDao.getUser(id);
	}

	public boolean addUser(UserModel userModel) {
		return userDao.addUser(userModel);
	}

	boolean updateUser(String id, String name) {
		return userDao.updateUser(id, name);
	}

	boolean deleteUser(String id) {
		return userDao.deleteUser(id);
	}
}
