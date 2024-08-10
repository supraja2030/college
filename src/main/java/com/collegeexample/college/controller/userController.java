package com.collegeexample.college.controller;

import com.collegeexample.college.dao.User;
import com.collegeexample.college.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")

public class userController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/User/{id}")
    public User getUser(@PathVariable("id") int id) {
        return userService.getUserData(id);

    }


}
