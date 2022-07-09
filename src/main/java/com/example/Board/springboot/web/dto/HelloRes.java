package com.example.Board.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloRes {
    private final String name;
    private final int amount;
}
