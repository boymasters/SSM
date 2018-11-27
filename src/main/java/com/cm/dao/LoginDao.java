package com.cm.dao;

import com.cm.model.LoginModel;
import com.cm.model.UserModel;

public interface LoginDao {
    LoginModel login(String name,String password);
}
