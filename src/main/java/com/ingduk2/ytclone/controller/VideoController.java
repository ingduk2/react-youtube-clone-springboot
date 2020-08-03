package com.ingduk2.ytclone.controller;

import com.ingduk2.ytclone.controller.dto.GetVideosDto;
import com.ingduk2.ytclone.controller.dto.ThumbnailDto;
import com.ingduk2.ytclone.controller.dto.UploadFilesDto;
import com.ingduk2.ytclone.domain.video.Video;
import com.ingduk2.ytclone.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("/getVideos")
    public GetVideosDto getVideos(){
        return videoService.findAll();
    }

    @PostMapping("/uploadfiles")
    public UploadFilesDto uploadFiles(){
        return new UploadFilesDto(true, "url", "fileName");
    }

    @PostMapping("/getVideoDetail")
    public Video getVideoDetail(){
        return new Video();
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
