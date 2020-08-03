package com.ingduk2.ytclone.domain.user;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor
@Document(collection = "users")
@ToString
public class User {
    @Id
    private ObjectId id;
    private String name;
    private String email;
    private String password;
    private String lastname;
    private String role;
    private String image;
    private Long tokenExp;

    @Builder
    public User(String name, String email, String password, String lastname, String role, String image, Long tokenExp) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.lastname = lastname;
        this.role = role;
        this.image = image;
        this.tokenExp = tokenExp;
    }
}
