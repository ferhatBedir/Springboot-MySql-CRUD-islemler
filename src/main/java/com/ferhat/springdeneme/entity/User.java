package com.ferhat.springdeneme.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @NotNull
    private Long userId;

    @Size(min = 3, max = 40)
    private String userFirstName;

    @Size(min = 3, max = 40)
    private String userLastName;

    private Date birthDate;

    @Size(min = 3, max = 40)
    private String userEmail;

    @Size(min = 2, max = 40)
    private String userDepartment;


    public User(@NotNull Long userId, @Size(min = 3, max = 40) String userFirstName,
                @Size(min = 3, max = 40) String userLastName, Date birthDate, @Size(min = 3, max = 40) String userEmail,
                @Size(min = 2, max = 40) String userDepartment) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.birthDate = birthDate;
        this.userEmail = userEmail;
        this.userDepartment = userDepartment;
    }

    public Long getId() {
        return Id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }
}
