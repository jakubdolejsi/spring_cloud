package com.example.userservice.controllers;


import com.example.userservice.models.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController{

    public final UserRepository userRepository;

    private static final String TOPIC = "testTopic";

    private final KafkaTemplate<String, String> kafkaTemplate;


    public UserController(UserRepository userRepository, KafkaTemplate<String, String> kafkaTemplate) {
        this.userRepository = userRepository;
        this.kafkaTemplate = kafkaTemplate;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userId}", produces = "application/json")
    public User GetUserById(@PathVariable("userId") Integer userId) {
        User user = userRepository.GetOne(userId);
        user.setEmail("adas");

        kafkaTemplate.send(TOPIC, "New id: " + userId.toString());

        System.out.println("Accepted id:" + userId);

        return user;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users", produces = "application/json")

    public List<User> GetAllUsers() {
        return userRepository.GetAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user", produces = "application/json")
    public User CreateUser(@RequestBody User user) {
//        this.sendMessage("user created");
        return user;
    }
//    private void sendMessage(String message) {
//        System.out.println("publishing message: " + message);
//        this.kafkaTemplate.send(TOPIC, message);
//        System.out.println("Published!");
//    }
}