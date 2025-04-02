package com.nanu.ruchihub.service;

import com.nanu.ruchihub.model.User;

public interface UserService {

    public User findUserByJwtToken(String jwt) throws Exception;

    public User findUserByEmail(String email) throws Exception;
}
