package com.cm.dao;

import com.cm.model.RegisterModel;

public interface RegisterDao {

    RegisterModel check(String name);

    boolean isRegisterSuccess(RegisterModel registerModel);
}
