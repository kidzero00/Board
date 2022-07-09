package com.example.Board.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateReq {
    private String title;
    private String content;

    @Builder
    public PostsUpdateReq(String title, String content){
        this.title = title;
        this.content = content;
    }

}
