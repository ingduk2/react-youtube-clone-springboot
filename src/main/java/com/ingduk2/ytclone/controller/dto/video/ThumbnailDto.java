package com.ingduk2.ytclone.controller.dto.video;

import lombok.Getter;

@Getter
public class ThumbnailDto {
    private boolean success;
    private String url;
    private int fileDuration;

    public ThumbnailDto(boolean success, String url, int fileDuration) {
        this.success = success;
        this.url = url;
        this.fileDuration = fileDuration;
    }
}
