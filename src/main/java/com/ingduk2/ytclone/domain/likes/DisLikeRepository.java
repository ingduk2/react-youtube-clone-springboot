package com.ingduk2.ytclone.domain.likes;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface DisLikeRepository extends MongoRepository<DisLike, ObjectId> {
//    Optional<DisLike> findByVideoId(ObjectId id);
//    Optional<DisLike> findByCommentId(ObjectId id);
    List<DisLike> findAllByVideoId(ObjectId id);
    List<DisLike> findAllByCommentId(ObjectId id);
}
