package com.ingduk2.ytclone.controller.dto.video;

import lombok.Getter;

@Getter
public class UploadFilesDto {
    private boolean success;
    private String url;
    private String fileName;

    public UploadFilesDto(boolean success, String url, String fileName) {
        this.success = success;
        this.url = url;
        this.fileName = fileName;
    }
}
