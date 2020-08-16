package com.ingduk2.ytclone.domain.likes;

import lombok.Getter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "likes")
@ToString
public class Like {
    private ObjectId _id;
    private ObjectId userId;
    private ObjectId videoId;
    private ObjectId commentId;
}
