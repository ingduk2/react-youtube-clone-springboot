package com.ingduk2.ytclone.domain.likes;

import lombok.Getter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Document(collection = "dislikes")
@ToString
public class DisLike {
    private ObjectId _id;
    private ObjectId userId;
    private ObjectId videoId;
    private ObjectId commentId;
}
