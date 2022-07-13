package com.example.Board.springboot.service;

import com.example.Board.springboot.domain.posts.Posts;
import com.example.Board.springboot.domain.posts.PostsRepository;
import com.example.Board.springboot.web.dto.PostsListRes;
import com.example.Board.springboot.web.dto.PostsRes;
import com.example.Board.springboot.web.dto.PostsSaveReq;
import com.example.Board.springboot.web.dto.PostsUpdateReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor //final이 선언된 모든 필드를 인자값으로 하는 생성자 생성
@Service
public class PostsService {

    private final PostsRepository postsRepository;
    @Transactional
    public long save(PostsSaveReq postsSaveReq){
        return postsRepository.save(postsSaveReq.toEntity()).getId();
    }
    @Transactional
    public long update(Long id, PostsUpdateReq postsUpdateReq){
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("no content. id =" + id));

        posts.update(postsUpdateReq.getTitle(), postsUpdateReq.getContent());
        return id;
    }

    public PostsRes findById(Long id){
        Posts entity = postsRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("no content. id= " + id));

        return new PostsRes(entity);
    }

    @Transactional
    public List<PostsListRes> findAllDesc() {
        return postsRepository.findAllDesc().stream()
                .map(PostsListRes::new)
                .collect(Collectors.toList());
    }
}
