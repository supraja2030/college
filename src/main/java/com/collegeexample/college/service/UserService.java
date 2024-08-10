package com.collegeexample.college.service;

import com.collegeexample.college.dao.User;
import com.collegeexample.college.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User getUserData(int user_id){
        return userRepo.findById(user_id).get();

    }
}
