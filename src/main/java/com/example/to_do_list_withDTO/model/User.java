package com.example.to_do_list_withDTO.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchConnectionDetails;

@Data
@Builder
public class User {
    private Integer id;
    private String username;
    private String password;

}