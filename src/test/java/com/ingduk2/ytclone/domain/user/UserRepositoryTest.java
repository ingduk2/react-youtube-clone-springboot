package com.ingduk2.ytclone.domain.user;

import com.ingduk2.ytclone.service.UserService;
import org.assertj.core.api.Assertions;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    UserService userService;

    @Test
    public void findAll(){
        List<User> result = userService.findAll();
        assertThat(result.size()).isEqualTo(1);
    }

    @Test
    public void selectName(){
        User user = userService.findByName("KYUNGDUCK");
        assertThat(user.getName()).isEqualTo("KYUNGDUCK");
    }

    @Test
    public void selectId(){
//        5f16bbdc4a00201559f307d0
//        51f16bbdc4a00201559f307d0
        User user = userService.findById(new ObjectId("5f16bbdc4a00201559f307d0"));
        assertThat(user.getEmail()).isEqualTo("ingduk2@naver.com");
    }
}