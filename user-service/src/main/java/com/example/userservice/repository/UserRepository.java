package com.example.userservice.repository;



import java.util.Arrays;
import java.util.List;

import com.example.userservice.models.User;
public class UserRepository {

    public User GetOne(Integer id) {
        return new User("jakub", "dolejsi", id.toString());
    }


    public List<User> GetAll() {
        User user = new User("jakub", "dolejsi", "aa@aa");
        User user1 = new User("jakub", "dolejsi", "aa@aa");
        User user2 = new User("jakub", "dolejsi", "aa@aa");
        User user3 = new User("jakub", "dolejsi", "aa@aa");

        return Arrays.asList(user, user1, user2, user3);
    }
}
