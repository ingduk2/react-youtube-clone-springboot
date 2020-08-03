package com.ingduk2.ytclone.domain.test;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor
@ToString
@Document(collection = "storeTwos")
public class StoreTwo {
    @Id
    private ObjectId id;

    private String name;


    private String bookId;

    @Builder
    public StoreTwo(String name, String bookId) {
        this.name = name;
        this.bookId = bookId;
    }
}
