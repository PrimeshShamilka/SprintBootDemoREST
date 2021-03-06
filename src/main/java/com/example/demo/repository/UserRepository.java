package com.example.demo.repository;

//import com.staxrt.tutorial.model.User;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface User repository.
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
