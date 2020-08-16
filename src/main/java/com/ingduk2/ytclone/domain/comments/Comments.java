package com.ingduk2.ytclone.domain.comments;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor
@Document(collection = "comments")
@ToString
public class Comments {
    private ObjectId _id;
    private ObjectId writer;
    private ObjectId postId;
    private ObjectId responseTo;
    private String content;

    @Builder
    public Comments(ObjectId writer, ObjectId postId, ObjectId responseTo, String content) {
        this.writer = writer;
        this.postId = postId;
        this.responseTo = responseTo;
        this.content = content;
    }
}
