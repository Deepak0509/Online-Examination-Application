package com.examportalbackend.services;

import com.examportalbackend.models.LoginRequest;
import com.examportalbackend.models.LoginResponse;
import com.examportalbackend.models.User;

public interface AuthService {
    User registerUserService(User user) throws Exception;

    LoginResponse loginUserService(LoginRequest loginRequest) throws Exception;
}
