package com.example.upload.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.upload.mapper.UserMapper;
import com.example.upload.model.BookModel;
import com.example.upload.model.UserModel;
import com.example.upload.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserModel getUserById(String id) {
        return userMapper.getUserById(id);
    }

    public UserModel getUserWithBookById(String id) {
        UserModel user = getUserById(id);
        user.setBook(getBookById((id)));
        return user;
    }

    public BookModel getBookById(String id) {
        return userMapper.getBookById(id);
    }

}