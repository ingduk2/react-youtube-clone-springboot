package com.ingduk2.ytclone.controller.dto.likes;

import com.ingduk2.ytclone.domain.likes.Like;
import lombok.Getter;
import lombok.ToString;
import org.bson.types.ObjectId;

import java.util.Optional;

@Getter
@ToString
public class LikeDto {
    private String _id;
    private String userId;
    private String videoId;
    private String commentId;

    public LikeDto(Like entity) {
        this._id = entity.get_id().toString();
        this.userId = entity.getUserId().toString();
        this.videoId = Optional.ofNullable(entity.getVideoId())
                .map(e -> e.toString()).orElse(null);
        this.commentId = Optional.ofNullable(entity.getCommentId())
                .map(e -> e.toString()).orElse(null);
    }
}
