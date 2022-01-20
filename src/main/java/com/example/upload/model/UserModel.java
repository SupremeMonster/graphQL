package com.example.upload.model;

import lombok.Data;

@Data
public class UserModel {

    public String id;
    public String mobile;
    public String name;
    public String address;
    public String sex;
    public BookModel book;

}
