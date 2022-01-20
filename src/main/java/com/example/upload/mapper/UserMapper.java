package com.example.upload.mapper;

import com.example.upload.model.BookModel;
import com.example.upload.model.UserModel;

public interface UserMapper {
    UserModel getUserById(String id);

    BookModel getBookById(String id);

}
