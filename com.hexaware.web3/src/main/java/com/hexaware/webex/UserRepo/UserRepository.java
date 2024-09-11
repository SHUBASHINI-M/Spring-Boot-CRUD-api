package com.hexaware.webex.UserRepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.webex.Entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
