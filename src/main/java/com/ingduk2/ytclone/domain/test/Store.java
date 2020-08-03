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
@Document(collection = "stores")
@ToString
public class Store {
    @Id
    private ObjectId id;

    private String name;

    @DBRef
    private Book book;

    @Builder
    public Store(String name, Book book) {
        this.name = name;
        this.book = book;
    }
}
