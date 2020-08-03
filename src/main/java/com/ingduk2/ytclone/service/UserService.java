package com.ingduk2.ytclone.service;

import com.ingduk2.ytclone.domain.user.User;
import com.ingduk2.ytclone.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findByName(String name){
        return userRepository.findByName(name).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. name=" + name));
    }

    public User findById(ObjectId id){
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id= " + id ));
    }
}
