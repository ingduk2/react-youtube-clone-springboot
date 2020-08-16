package com.ingduk2.ytclone.service;

import com.ingduk2.ytclone.controller.dto.comments.GetCommentsDto;
import com.ingduk2.ytclone.domain.comments.Comments;
import com.ingduk2.ytclone.domain.comments.CommentsRepository;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.stream.events.Comment;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CommentsServiceTest {

    @Autowired
    CommentsService commentsService;
    @Autowired
    CommentsRepository commentsRepository;

    @Test
    public void getCommentsAllById(){
        Iterable<Comments> comments = commentsService.getCommentsAllById("5f1b2de78bcba690091f214b");
        List<Comments> commentsList = new ArrayList<>();
        comments.forEach(commentsList::add);
        System.out.println(commentsList);
        assertThat(commentsList.size()).isNotEqualTo(0);
    }


    @Test
    public void getCommentsAllByPostId(){
        Iterable<Comments> comments = commentsService.getCommentsAllByPostId("5f19de2dc12e3f6279deaa67");
        List<Comments> commentsList = new ArrayList<>();
        comments.forEach(commentsList::add);
        System.out.println(commentsList);
        assertThat(commentsList.size()).isNotEqualTo(0);
    }


    @Test
    public void getCommentsAllByPostId_Jpa(){
        List<Comments> comments = commentsRepository.findAllByPostId(new ObjectId("5f19de2dc12e3f6279deaa67"));
        assertThat(comments.size()).isNotEqualTo(0);
    }

    @Test
    public void getComment(){
        Comments comment = commentsRepository.findByPostId(new ObjectId("5f19de2dc12e3f6279deaa67")).get();
        System.out.println(comment);
    }

    @Test
    public void getCommentsWithUser(){
        GetCommentsDto commentsByPostId = commentsService.getCommentsByPostId("5f19de2dc12e3f6279deaa67");
        System.out.println(commentsByPostId);
    }

}