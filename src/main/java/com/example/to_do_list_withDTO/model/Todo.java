package com.example.to_do_list_withDTO.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Todo {
    private Integer id;
    private String title;
    private boolean completed;
    private Integer userId;
}