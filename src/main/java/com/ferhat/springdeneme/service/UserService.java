package com.ferhat.springdeneme.service;

import com.ferhat.springdeneme.entity.User;
import com.ferhat.springdeneme.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findFirstByUserId(Long id) {
        return userRepository.findFirstByUserId(id);
    }

    public void addUser(User user) {
        User user1 = findFirstByUserId(user.getUserId());
        if (user1 == null) {
            userRepository.save(user);
        } else {
            System.out.println();
            System.out.println("User Id : " + user1.getUserId());
            System.out.println("User Name : " + user1.getUserFirstName());
            System.out.println("User LastName : " + user1.getUserLastName());
            System.out.println("User Department Name : " + user1.getUserDepartment());
            System.out.println("User Email : " + user1.getUserEmail());
            System.out.println("Bu kişi db de var..");
            System.out.println("********************************************");
        }

    }

    public void getUser(Long id) {
        User user = userRepository.findFirstByUserId(id);
        if (user == null) {
            throw new NullPointerException("Kayıt Db' de bulunamadı");
        } else {
            System.out.println();
            System.out.println("User Id : " + user.getUserId());
            System.out.println("User Name : " + user.getUserFirstName());
            System.out.println("User LastName : " + user.getUserLastName());
            System.out.println("User Department Name : " + user.getUserDepartment());
            System.out.println("User Email : " + user.getUserEmail());
            System.out.println("********************************************");
        }
    }

    public void deleteUser(Long id) {
        User user = userRepository.findFirstByUserId(id);
        if (user == null) {
            throw new NullPointerException("Kayıt Db' de bulunamadı");
        } else {
            userRepository.delete(user);
        }
    }

    public void updateUser(User user) {
        User userTemp = userRepository.findFirstByUserId(user.getUserId());
        if (userTemp == null) {
            throw new NullPointerException("Kayıt Db' de bulunamadı");
        } else {
            userTemp.setUserFirstName(user.getUserFirstName());
            userTemp.setUserLastName(user.getUserLastName());
            userTemp.setUserDepartment(user.getUserDepartment());
            userTemp.setUserEmail(user.getUserEmail());
            userRepository.save(userTemp);
        }

    }

    public void getAllUser() {
        List<User> userList = new ArrayList<>();
        userList = (List<User>) userRepository.findAll();
        if (userList == null) {
            System.out.println("Db' de hiç kayıt yok");
        } else {
            for (int i = 0; i < userList.size(); i++) {
                System.out.println();
                System.out.println("User Id : " + userList.get(i).getUserId());
                System.out.println("User Name : " + userList.get(i).getUserFirstName());
                System.out.println("User LastName : " + userList.get(i).getUserLastName());
                System.out.println("User Department Name : " + userList.get(i).getUserDepartment());
                System.out.println("User Email : " + userList.get(i).getUserEmail());
                System.out.println("********************************************");

            }
        }
    }
}
