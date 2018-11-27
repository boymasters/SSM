package com.cm.controller;

import com.cm.gsonmodel.UserGsonListModel;
import com.cm.gsonmodel.UserGsonModel;
import com.cm.model.UserModel;
import com.cm.service.UserService;
import com.cm.utils.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

	private UserService userService;
	private UserGsonListModel userGsonListModel;
	private UserGsonModel userGsonModel;
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "getAllUsers", method = RequestMethod.GET)
	public UserGsonListModel<UserModel> getAllUsers() {
		List<UserModel> userModels = userService.getAllUsers();
		if (userModels != null && userModels.size() > 0) {
			userGsonListModel = new UserGsonListModel(utils.success_code,utils.success,userModels);
		}else {
			userModels = new ArrayList<>();
			userGsonListModel = new UserGsonListModel(utils.fail_code,utils.fail,userModels);
		}
		return userGsonListModel;
	}

	@RequestMapping(value = "getUser/{id}", method = RequestMethod.GET)
	public UserGsonModel getUser(@PathVariable int id) {
		UserModel userModel = userService.getUser(id);
		if (null != userModel) {
			userGsonModel = new UserGsonModel(utils.success_code,utils.success,userModel);
		}else {
			userModel = new UserModel();
			userGsonModel = new UserGsonModel(utils.fail_code,utils.fail,userModel);
		}
		return userGsonModel;
	}

	@RequestMapping(value = "addUser", method = RequestMethod.GET)
	public boolean addUser(UserModel userModel) {
		boolean addUser = userService.addUser(userModel);
		return addUser;
	}
}
