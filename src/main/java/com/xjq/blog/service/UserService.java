package com.xjq.blog.service;

import com.xjq.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
