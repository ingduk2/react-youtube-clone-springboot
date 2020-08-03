package com.ingduk2.ytclone.domain.test;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor
@Document(collection = "books")
@ToString
public class Book {
    @Id
    private ObjectId id;
    private String name;
//    private String content;

    @Builder
    public Book(String name) {
        this.name = name;
    }
}
