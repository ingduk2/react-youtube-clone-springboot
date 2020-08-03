package com.ingduk2.ytclone.controller.dto;

import com.ingduk2.ytclone.domain.user.User;
import lombok.Getter;
import lombok.ToString;
import org.bson.types.ObjectId;

@ToString
@Getter
public class UserDto {
    private ObjectId _id;
    private String name;
    private String email;
    private String password;
    private String lastname;
    private String role;
    private String image;
    private Long tokenExp;

    public UserDto(User entity) {
        this._id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.password = entity.getPassword();
        this.lastname = entity.getLastname();
        this.role = entity.getRole();
        this.image = entity.getImage();
        this.tokenExp = entity.getTokenExp();
    }
}
