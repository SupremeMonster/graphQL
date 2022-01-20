package com.example.upload.controller;

import com.example.upload.model.QueryModel;
import graphql.ExecutionResult;
import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/graphql")
@Controller
public class GraphQLController {
    @Autowired
    private GraphQL graphQL;

    @RequestMapping("/user")
    @ResponseBody
    public Object query(@RequestBody QueryModel query) {
        ExecutionResult result = this.graphQL.execute(query.getQuery());
        return result.toSpecification();
    }
}