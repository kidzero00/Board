package com.example.Board.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts,Long>
// <entity, pk타입>
    {
        @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
        List<Posts> findAllDesc();

    }
