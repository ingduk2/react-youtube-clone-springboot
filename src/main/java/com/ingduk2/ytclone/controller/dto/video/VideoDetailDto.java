package com.ingduk2.ytclone.controller.dto.video;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class VideoDetailDto {

    private boolean success;
    private VideoDto videoDetail;

    public VideoDetailDto(boolean success, VideoDto videoDetail) {
        this.success = success;
        this.videoDetail = videoDetail;
    }
}
