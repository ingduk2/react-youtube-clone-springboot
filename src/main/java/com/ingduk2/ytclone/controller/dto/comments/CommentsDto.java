package com.ingduk2.ytclone.controller.dto.comments;

import com.ingduk2.ytclone.controller.dto.user.UserDto;
import com.ingduk2.ytclone.domain.comments.Comments;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.bson.types.ObjectId;

import java.util.Optional;

@Getter
@ToString
public class CommentsDto {
    private String _id;
    private UserDto writer;
    private String postId;
    private String responseTo;
    private String content;

    @Builder
    public CommentsDto(Comments entity, UserDto writer) {
        this._id = entity.get_id().toString();
        this.writer = writer;
        this.postId = entity.getPostId().toString();
        this.responseTo = Optional.ofNullable(entity.getResponseTo())
                .map(e -> e.toString())
                .orElse(null);
        this.content = entity.getContent();
    }
}
