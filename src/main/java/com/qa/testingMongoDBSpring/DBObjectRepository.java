package com.qa.testingMongoDBSpring;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "email", path="email")
public interface DBObjectRepository extends MongoRepository<DBObject, String>{
	public List<DBObject> findByeMail(@Param("eMail") String eMail);
}
