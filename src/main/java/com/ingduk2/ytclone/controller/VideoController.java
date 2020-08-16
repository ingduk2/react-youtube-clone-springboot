package com.ingduk2.ytclone.controller;

import com.ingduk2.ytclone.controller.dto.video.GetVideosDto;
import com.ingduk2.ytclone.controller.dto.video.ThumbnailDto;
import com.ingduk2.ytclone.controller.dto.video.UploadFilesDto;
import com.ingduk2.ytclone.controller.dto.video.VideoDetailDto;
import com.ingduk2.ytclone.domain.video.Video;
import com.ingduk2.ytclone.service.VideoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/video")
@RequiredArgsConstructor
@Slf4j
public class VideoController {

    private final VideoService videoService;

    @GetMapping("/getVideos")
    public GetVideosDto getVideos(){
        return videoService.findAll();
    }

    @PostMapping("/uploadfiles")
    public UploadFilesDto uploadFiles(){
        return new UploadFilesDto(true, "url", "fileName");
    }

    @PostMapping("/getVideoDetail")
    public VideoDetailDto getVideoDetail(@RequestBody Map<String, Object> videoId){
        log.info("videoId : {} ", videoId.get("videoId").toString());
        return videoService.findById(videoId.get("videoId").toString());
    }

    @PostMapping("/thumbnail")
    public ThumbnailDto thumbnail(){
        return new ThumbnailDto(true, "1", 1);
    }

    @PostMapping("/uploadVideo")
    public boolean uploadVideo(){
        return true;
    }

    @PostMapping("/getSubscriptionVideo")
    public List<Video> getSubscriptionVideo(){
        return null;
    }






}
