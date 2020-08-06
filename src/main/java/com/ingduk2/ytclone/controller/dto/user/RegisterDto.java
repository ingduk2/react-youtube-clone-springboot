package com.ingduk2.ytclone.controller.dto.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegisterDto {
    private String email;
    private String password;
    private String name;
    private String image;
}
