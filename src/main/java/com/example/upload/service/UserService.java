package com.example.upload.service;

import com.example.upload.model.BookModel;
import com.example.upload.model.UserModel;

public interface UserService {
    UserModel getUserById(String id);

    BookModel getBookById(String id);

    UserModel getUserWithBookById(String id);
}
