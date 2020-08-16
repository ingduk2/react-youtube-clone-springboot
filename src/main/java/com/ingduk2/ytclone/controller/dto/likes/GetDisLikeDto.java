package com.ingduk2.ytclone.controller.dto.likes;

import com.ingduk2.ytclone.domain.likes.DisLike;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class GetDisLikeDto {
    private boolean success;
    private List<DisLikeDto> dislikes;

    public GetDisLikeDto(boolean success, List<DisLikeDto> dislikes) {
        this.success = success;
        this.dislikes = dislikes;
    }
}
