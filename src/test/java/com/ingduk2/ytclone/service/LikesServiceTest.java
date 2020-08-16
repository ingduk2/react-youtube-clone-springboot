package com.ingduk2.ytclone.service;

import com.ingduk2.ytclone.controller.dto.likes.GetDisLikeDto;
import com.ingduk2.ytclone.controller.dto.likes.GetLikesDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LikesServiceTest {
    @Autowired
    LikesService likesService;

    @Test
    public void findAllTest(){
        GetDisLikeDto getDisLikeDto = likesService.disLikefindByCommentId("5f1b2df18bcba690091f214e");
        assertThat(getDisLikeDto.getDislikes().size()).isNotEqualTo(0);
        assertThat(getDisLikeDto.getDislikes().get(0).getCommentId()).isEqualTo("5f1b2df18bcba690091f214e");

        GetDisLikeDto getDisLikeDto1 = likesService.disLikefindByVideoId("5f1b2f91a19e9c905f45a44c");
        assertThat(getDisLikeDto1.getDislikes().size()).isEqualTo(0);

        GetLikesDto getLikesDto = likesService.likefindByCommentId("5f1b2de78bcba690091f214b");
        assertThat(getLikesDto.getLikes().size()).isEqualTo(1);
        assertThat(getLikesDto.getLikes().get(0).getCommentId()).isEqualTo("5f1b2de78bcba690091f214b");

        GetLikesDto getLikesDto1 = likesService.likeFindByVideoId("5f19de2dc12e3f6279deaa67");
        assertThat(getLikesDto1.getLikes().size()).isEqualTo(1);
        assertThat(getLikesDto1.getLikes().get(0).getVideoId()).isEqualTo("5f19de2dc12e3f6279deaa67");
    }
}