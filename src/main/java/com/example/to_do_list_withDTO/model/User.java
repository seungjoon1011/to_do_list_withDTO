package com.example.to_do_list_withDTO.model;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
}