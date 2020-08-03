package com.ingduk2.ytclone.controller.dto;

import com.ingduk2.ytclone.domain.user.User;
import com.ingduk2.ytclone.domain.video.Video;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class GetVideosDto {
    private boolean success;
    private List<VideoDto> videos;

    @Builder
    public GetVideosDto(boolean success, List<VideoDto> videos) {
        this.success = success;
        this.videos = videos;
    }
}
