package com.ingduk2.ytclone.domain.video;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, ObjectId> {
}
