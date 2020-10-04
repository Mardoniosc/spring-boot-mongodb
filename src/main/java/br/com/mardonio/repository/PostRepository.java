package br.com.mardonio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.mardonio.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
