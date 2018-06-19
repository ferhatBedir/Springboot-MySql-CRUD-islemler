package com.ferhat.springdeneme.controller;


import com.ferhat.springdeneme.entity.User;
import com.ferhat.springdeneme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


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

}
