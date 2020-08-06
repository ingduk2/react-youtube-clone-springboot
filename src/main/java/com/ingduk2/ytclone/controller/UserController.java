package com.ingduk2.ytclone.controller;

import com.ingduk2.ytclone.controller.dto.user.LoginDto;
import com.ingduk2.ytclone.controller.dto.user.RegisterDto;
import com.ingduk2.ytclone.domain.user.User;
import com.ingduk2.ytclone.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
@Slf4j
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @GetMapping("/api/test")
    public List<User> test(Model model){
        return userService.findAll();
    }

    @GetMapping("/auth")
    public void auth(String param){
      log.info("auth  {}" , param);
    }

    @PostMapping("/register")
    public void register(@RequestBody RegisterDto param){
        log.info("register : {} ", param);
    }

    @GetMapping("/logout")
    public Map<String, Object> logout(String param){
        log.info("logout : {}", param);
        Map<String, Object> ret = new HashMap<>();
        ret.put("success", true);
        return ret;
    }

    @PostMapping("/login")
//    public void login(@RequestBody Map<String, Object> param){
        public void login(@RequestBody LoginDto param){
        log.info("login : {}", param);
    }
}
