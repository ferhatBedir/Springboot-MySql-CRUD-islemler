package com.ferhat.springdeneme.controller;


import com.ferhat.springdeneme.entity.User;
import com.ferhat.springdeneme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/adduser")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/getuser")
    public void getUser(@RequestParam(value = "id") Long id) {
        userService.getUser(id);
    }

    @DeleteMapping("/userdelete")
    public void deleteUser(@RequestParam(value = "id") Long id) {
        userService.deleteUser(id);
    }

    @PostMapping("/updateuser")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @GetMapping("/allviewusers")
    public void viewUsers() {
        userService.getAllUser();
    }

    @PostMapping("/addusers")
    public void addUsers(@RequestBody List<User> users) {
        userService.addUsers(users);
    }

    @DeleteMapping("/usersdelete")
    public void usersDelete() {
        userService.deleteAllUsers();
    }

    @GetMapping("/getusername")
    public void getUserName(@RequestParam(value = "name") String name) {
        userService.getUserName(name);
    }
}
