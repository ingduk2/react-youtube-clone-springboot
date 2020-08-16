package com.ingduk2.ytclone.controller;

import com.ingduk2.ytclone.controller.dto.comments.GetCommentsDto;
import com.ingduk2.ytclone.service.CommentsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
//@Controller
@RequestMapping("/api/comment")
@RequiredArgsConstructor
@Slf4j
public class CommentsController {

    private final CommentsService commentsService;

    @PostMapping("/getComments")
    public GetCommentsDto getComments(@RequestBody Map<String, Object> videoId){
        String postId = videoId.get("videoId").toString();
        log.info("postId : {} "  , postId);
        return commentsService.getCommentsByPostId(postId);
    }
}
