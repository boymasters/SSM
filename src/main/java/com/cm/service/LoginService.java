package com.cm.service;

import com.cm.dao.LoginDao;
import com.cm.model.LoginModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginService {
    @Autowired
    private LoginDao loginDao;


    public LoginModel login(String name, String password) {
        return loginDao.login(name,password);
    }

}
