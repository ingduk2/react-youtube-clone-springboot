package com.ingduk2.ytclone.domain.video;

import com.ingduk2.ytclone.service.VideoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VideoRepositoryTest {

    @Autowired
    private VideoService videoService;
    @Autowired
    private VideoRepository videoRepository;

    @Test
    public void findAll(){
        System.out.println(videoRepository.findAll());
    }

    @Test
    public void findAllTest(){
        System.out.println(videoService.findAll());
    }
}