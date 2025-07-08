package com.example.to_do_list_withDTO.controller;

import com.example.to_do_list_withDTO.model.User;
import com.example.to_do_list_withDTO.repository.TodoRepository;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {
    private final TodoRepository todoRepository;

    private User getCurrentUser(HttpSession session) {
        return (User) session.getAttribute("user");
    }

    @GetMapping
    public String list(HttpSession httpSession) {
        System.out.println(getCurrentUser(httpSession));

        return "todo-list";
    }
}