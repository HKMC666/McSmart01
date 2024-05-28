package com.softeem.springboot01.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {

    //Integer -> int
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private LocalDateTime regtime;
    private String img;
    private LocalDate birth;
    private Integer status;
    private String salt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getRegtime() {
        return regtime;
    }

    public void setRegtime(LocalDateTime regtime) {
        this.regtime = regtime;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
