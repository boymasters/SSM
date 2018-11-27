package com.cm.controller;

import com.cm.model.RegisterModel;
import com.cm.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class RegisterController {
    private String exists = "已存在";
    private String success="注册成功";
    private String fail = "注册失败";
    private RegisterService registerService;
    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @RequestMapping(value="user_register",method = RequestMethod.GET)
    @ResponseBody
    public String RegisterSuccess(RegisterModel registerModel) {
        registerModel = registerService.check(registerModel);
        if (null != registerModel) {
            return exists;
        }
        boolean isRegisterSuccess = registerService.isRegisterSuccess(registerModel);
        if (isRegisterSuccess){
            return success;
        }else {
            return fail;
        }
    }
}
