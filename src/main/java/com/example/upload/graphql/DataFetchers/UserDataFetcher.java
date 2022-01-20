package com.example.upload.graphql.DataFetchers;

import com.example.upload.model.BookModel;
import com.example.upload.model.UserModel;
import com.example.upload.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import graphql.schema.DataFetcher;

@Component
public class UserDataFetcher {

    @Autowired
    private UserService userService;

    public DataFetcher<UserModel> getUserByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            String id = dataFetchingEnvironment.getArgument("id");
            return userService.getUserById(id);
        };
    }

    public DataFetcher<BookModel> getBookByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            String id = dataFetchingEnvironment.getArgument("id");
            return userService.getBookById(id);
        };
    }

    public DataFetcher<UserModel> getUserWithBookByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            String id = dataFetchingEnvironment.getArgument("id");
            return userService.getUserWithBookById(id);
        };
    }

}
