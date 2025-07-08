package com.example.to_do_list_withDTO.repository;

import com.example.to_do_list_withDTO.model.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TodoRepository {
    private final JdbcTemplate jdbcTemplate;

    public int save(Todo todo) {
        String sql = "INSERT INTO todo (user_id, title, completed) VALUES (?, ?, ?)";

        return jdbcTemplate.update(sql, todo.getUserId(), todo.getTitle(), todo.isCompleted());
    }
}