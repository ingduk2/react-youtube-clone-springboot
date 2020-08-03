package com.ingduk2.ytclone.domain.video;

import com.ingduk2.ytclone.domain.user.User;
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
@Document(collection = "videos")
@ToString
public class Video {

    @Id
    private ObjectId id;

    private ObjectId writer;

    private String title;

    private String description;

    private int privacy;

    private String filePath;

    private String category;

    private int views;

    private String duration;

    private String thumbnail;

    private String createdAt;

    private String updatedAt;

    @Builder
    public Video(ObjectId writer, String title, String description, int privacy, String filePath, String category, int views, String duration, String thumbnail, String createdAt, String updatedAt) {
        this.writer = writer;
        this.title = title;
        this.description = description;
        this.privacy = privacy;
        this.filePath = filePath;
        this.category = category;
        this.views = views;
        this.duration = duration;
        this.thumbnail = thumbnail;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
