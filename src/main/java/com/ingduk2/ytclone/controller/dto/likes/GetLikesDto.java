package com.ingduk2.ytclone.controller.dto.likes;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class GetLikesDto {
    private boolean success;
    private List<LikeDto> likes;

    public GetLikesDto(boolean success, List<LikeDto> likes) {
        this.success = success;
        this.likes = likes;
    }
}
