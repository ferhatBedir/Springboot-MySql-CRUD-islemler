package com.ferhat.springdeneme.controller;


import com.ferhat.springdeneme.service.UserService;
import com.ferhat.springdeneme.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/adduser")
    public void addUser(@RequestBody User user) {
        Date date = new Date();
        user.setBirthDate(date);
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

    @DeleteMapping("/usedeletebyuserid")
    public void deleteByUserId(@RequestParam(value = "id") Long userId) {
        userService.deleteUserByUserId(userId);
    }

    @GetMapping("/getusername")
    public void getUserName(@RequestParam(value = "name") String name) {
        userService.getUserName(name);
    }
}
