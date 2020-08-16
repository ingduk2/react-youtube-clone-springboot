package com.ingduk2.ytclone.domain.comments;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CommentsRepository extends MongoRepository<Comments, ObjectId> {
    Optional<Comments> findByPostId(ObjectId postId);
    List<Comments> findAllByPostId(ObjectId postId);
    Iterable<Comments> findAllByPostId(Iterable<ObjectId> ids);
}
