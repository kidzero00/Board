package com.example.Board.springboot.web.dto;

import com.example.Board.springboot.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsRes {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsRes(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
