package com.ingduk2.ytclone.service;

import com.ingduk2.ytclone.controller.dto.video.GetVideosDto;
import com.ingduk2.ytclone.controller.dto.video.VideoDetailDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class VideoServiceTest {
    @Autowired
    private VideoService videoService;

    @Test
    public void findAllTestStream(){
        //Object 기 때문에 안될듯함.
        GetVideosDto retA = videoService.findAll();
        GetVideosDto retB = videoService.findAllStream();
        System.out.println(retA);
        System.out.println(retB);
        assertThat(retA.toString()).isEqualTo(retB.toString());
    }

    @Test
    public void findOneTest(){
//        5f19ca7a03a4cc5c73a24699
        VideoDetailDto dto = videoService.findById("5f19ca7a03a4cc5c73a24699");
        assertThat(dto.getVideoDetail().get_id()).isEqualTo("5f19ca7a03a4cc5c73a24699");
    }
}