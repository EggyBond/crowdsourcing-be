package com.yourapp.modules.post.repository;


import com.yourapp.modules.post.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface PostRepository extends JpaRepository<Post, Long> {
List<Post> findByStatus(String status);
}