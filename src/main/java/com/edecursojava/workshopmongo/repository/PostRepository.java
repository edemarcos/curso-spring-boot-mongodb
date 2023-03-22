package com.edecursojava.workshopmongo.repository;

import com.edecursojava.workshopmongo.domain.Post;
import com.edecursojava.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
