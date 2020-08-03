package com.ingduk2.ytclone.controller;

import com.ingduk2.ytclone.domain.user.User;
import com.ingduk2.ytclone.domain.user.UserRepository;
import com.ingduk2.ytclone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @GetMapping("/api/test")
    public List<User> test(Model model){
        return userService.findAll();
    }
}
