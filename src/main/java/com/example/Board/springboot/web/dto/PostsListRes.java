package com.example.Board.springboot.web.dto;

import com.example.Board.springboot.domain.posts.Posts;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
public class PostsListRes {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListRes(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
