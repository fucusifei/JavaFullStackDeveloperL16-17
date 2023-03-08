package com.yevdokymov.repository;

import com.yevdokymov.data.PepData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PepRepository extends MongoRepository<PepData, String> {

}
