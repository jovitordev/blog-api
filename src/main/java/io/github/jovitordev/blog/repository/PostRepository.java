package io.github.jovitordev.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.jovitordev.blog.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
