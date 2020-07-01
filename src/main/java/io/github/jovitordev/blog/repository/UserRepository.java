package io.github.jovitordev.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.jovitordev.blog.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	 Optional<User> findByUserName(String username);
}
