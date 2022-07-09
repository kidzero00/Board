package com.example.Board.springboot.web;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.example.Board.springboot.service.PostsService;
import com.example.Board.springboot.web.dto.PostsRes;
import com.example.Board.springboot.web.dto.PostsSaveReq;
import com.example.Board.springboot.web.dto.PostsUpdateReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveReq postsSaveReq){
        return postsService.save(postsSaveReq);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateReq postsUpdateReq){
        return postsService.update(id,postsUpdateReq);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsRes findById(@PathVariable Long id){
        return postsService.findById(id);
    }


}
