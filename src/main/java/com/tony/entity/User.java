package com.tony.entity;

import javax.persistence.*;

@Entity(name="tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String username;
    @Column
    private String phone;
    @Column
    private String password;

//getter和setter
}