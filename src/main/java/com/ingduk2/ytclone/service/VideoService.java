package com.ingduk2.ytclone.service;

import com.ingduk2.ytclone.controller.dto.GetVideosDto;
import com.ingduk2.ytclone.controller.dto.UserDto;
import com.ingduk2.ytclone.controller.dto.VideoDto;
import com.ingduk2.ytclone.domain.user.User;
import com.ingduk2.ytclone.domain.video.Video;
import com.ingduk2.ytclone.domain.video.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class VideoService {

    @Autowired
    private final VideoRepository videoRepository;

    @Autowired
    private final UserService userService;

    public GetVideosDto findAll(){
        List<Video> videos = videoRepository.findAll();
        List<VideoDto> videoDtos = new ArrayList<>();
        for(Video video : videos){
            User user = userService.findById(video.getWriter());
            UserDto userDto = new UserDto(user);
            VideoDto videoDto = new VideoDto(video, userDto);
            videoDtos.add(videoDto);
        }

        GetVideosDto results = new GetVideosDto(true, videoDtos);
        return results;
    }
}
