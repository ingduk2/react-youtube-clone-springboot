package com.ingduk2.ytclone.service;

import com.ingduk2.ytclone.controller.dto.video.GetVideosDto;
import com.ingduk2.ytclone.controller.dto.user.UserDto;
import com.ingduk2.ytclone.controller.dto.video.VideoDetailDto;
import com.ingduk2.ytclone.controller.dto.video.VideoDto;
import com.ingduk2.ytclone.domain.user.User;
import com.ingduk2.ytclone.domain.video.Video;
import com.ingduk2.ytclone.domain.video.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        return new GetVideosDto(true, videoDtos);
    }

    public GetVideosDto findAllStream(){
        List<VideoDto> videoDtos = videoRepository.findAll().stream().map(video -> {
            UserDto userDto = new UserDto(userService.findById(video.getWriter()));
            return new VideoDto(video, userDto);
        }).collect(Collectors.toList());

        return new GetVideosDto(true, videoDtos);
    }

    public VideoDetailDto findById(String id){
        Video entity = videoRepository.findById(new ObjectId(id)).orElseThrow(() -> new IllegalArgumentException("해당 비디오가 없습니다. id= " + id ));
        VideoDto videoDto = new VideoDto(entity, new UserDto(userService.findById(entity.getWriter())));
        return new VideoDetailDto(true, videoDto);
    }
}
