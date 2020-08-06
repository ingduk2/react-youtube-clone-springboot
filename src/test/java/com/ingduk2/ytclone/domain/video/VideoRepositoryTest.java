package com.ingduk2.ytclone.domain.video;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
@SpringBootTest
class VideoRepositoryTest {

    @Autowired
    private VideoRepository videoRepository;

    @Test
    public void findAll(){
        List<Video> list = videoRepository.findAll();
        assertThat(list.size()).isEqualTo(3);
    }

}