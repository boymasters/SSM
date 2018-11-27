package com.cm.service;

import com.cm.dao.RegisterDao;
import com.cm.model.RegisterModel;
import com.cm.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
@Transactional
public class RegisterService {
    @Autowired
    private RegisterDao registerDao;

    public RegisterModel check(RegisterModel registerModel){
        return registerDao.check(registerModel.getName());
    };

    public boolean isRegisterSuccess(RegisterModel registerModel){
        return registerDao.isRegisterSuccess(registerModel);
    };

}
