package com.example.demo.brd.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class BoardDto {
	private int boardNum;
	private String  title;
	private String content;
	private String writtenDate;
}
