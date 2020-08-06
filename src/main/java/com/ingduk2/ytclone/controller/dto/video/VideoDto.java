package com.ingduk2.ytclone.controller.dto.video;

import com.ingduk2.ytclone.controller.dto.user.UserDto;
import com.ingduk2.ytclone.domain.video.Video;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class VideoDto {
    private String _id;
    private UserDto writer;
    private String title;
    private String description;
    private int privacy;
    private String filePath;
    private String category;
    private int views;
    private String duration;
    private String thumbnail;
    private String createdAt;
    private String updatedAt;

    public VideoDto(Video entity, UserDto userEntity) {
        this._id = entity.getId().toString();
        this.writer = userEntity;
        this.title = entity.getTitle();
        this.description = entity.getDescription();
        this.privacy = entity.getPrivacy();
        this.filePath = entity.getFilePath();
        this.category = entity.getCategory();
        this.views = entity.getViews();
        this.duration = entity.getDuration();
        this.thumbnail = entity.getThumbnail();
        this.createdAt = entity.getCreatedAt();
        this.updatedAt = entity.getUpdatedAt();
    }
}
