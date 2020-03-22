package com.shepherd.microserviceprovideruserdemo.domain;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    private String name;

    private Boolean status;

    private String address;

    private String province;

    private String city;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", address='" + address + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

