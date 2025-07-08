package com.example.to_do_list_withDTO.controller;

import com.example.to_do_list_withDTO.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private  final UserRepository userRepository;

    @GetMapping({"/", "/login"})
    public String showLogin() {
        return "login";
    }
}