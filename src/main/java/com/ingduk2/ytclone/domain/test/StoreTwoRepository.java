package com.ingduk2.ytclone.domain.test;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreTwoRepository extends MongoRepository<StoreTwo, ObjectId> {
}
