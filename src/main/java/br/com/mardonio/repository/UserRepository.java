package br.com.mardonio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.mardonio.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
