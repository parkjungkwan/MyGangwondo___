package com.example.demo.brd.service;

import java.util.List;

import com.example.demo.brd.domain.Board;
import com.example.demo.brd.domain.BoardDto;

public interface BoardService {

	public int insertWritter(BoardDto b);

	public List<Board> selectAll();

	public Board selectById(String title);

	public int update(BoardDto b);

	public int delete(BoardDto b);

}
