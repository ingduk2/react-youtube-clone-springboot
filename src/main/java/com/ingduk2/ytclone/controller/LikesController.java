package com.ingduk2.ytclone.controller;

import com.ingduk2.ytclone.controller.dto.likes.GetDisLikeDto;
import com.ingduk2.ytclone.controller.dto.likes.GetLikesDto;
import com.ingduk2.ytclone.service.LikesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/like")
@Slf4j
public class LikesController {

    private final LikesService likesService;

    @PostMapping("/getLikes")
    public GetLikesDto getLikes(@RequestBody Map<String, Object> param) {
        //키를 줄때있고, 안줄때 있음
        log.info("getLikes : {}", param);
        GetLikesDto response = null;
        if (param.containsKey("videoId")) {
            response = likesService.likeFindByVideoId(param.get("videoId").toString());
        } else {
            response = likesService.likefindByCommentId(param.get("commentId").toString());
        }
        return response;
    }

    @PostMapping("/getDisLikes")
    public GetDisLikeDto getDisLikes(@RequestBody Map<String, Object> param) {
        log.info("getDisLikes : {}", param);
        GetDisLikeDto response = null;
        if (param.containsKey("videoId")) {
            response = likesService.disLikefindByVideoId(param.get("videoId").toString());
        } else {
            response = likesService.disLikefindByCommentId(param.get("commentId").toString());
        }
        return response;
    }
}
