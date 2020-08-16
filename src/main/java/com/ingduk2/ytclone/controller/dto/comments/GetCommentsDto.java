package com.ingduk2.ytclone.controller.dto.comments;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@ToString
public class GetCommentsDto {
    private boolean success;
    private List<CommentsDto> comments;

    public GetCommentsDto(boolean success, List<CommentsDto> comments) {
        this.success = success;
        this.comments = comments;
    }
}
