package com.ingduk2.ytclone.domain.likes;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface LikeRepository extends MongoRepository<Like, ObjectId> {
//    Optional<Like> findByVideoId(ObjectId id);
//    Optional<Like> findByCommentId(ObjectId id);
    List<Like> findAllByVideoId(ObjectId id);
    List<Like> findAllByCommentId(ObjectId id);
}
