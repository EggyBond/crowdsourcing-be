package com.yourapp.modules.post.controller;


import com.yourapp.modules.post.model.Post;
import com.yourapp.modules.post.repository.PostRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostRepository postRepository;


    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @GetMapping
    public List<Post> list(@RequestParam(required = false) String status) {
        if (status == null) return postRepository.findAll();
        return postRepository.findByStatus(status);
    }


    @PostMapping
    public Post create(@RequestBody Post p) {
        p.setStatus("OPEN");
        return postRepository.save(p);
    }
}