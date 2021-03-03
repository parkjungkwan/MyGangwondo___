package com.example.demo.brd.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.brd.domain.Board;
import com.example.demo.brd.domain.BoardDto;
import com.example.demo.brd.repository.BoardRepository;
import com.example.demo.brd.repository.BoardRepositoryImpl;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	public final BoardRepository boardMapper;

	@Override
	public int insertWritter(BoardDto b) {
		// TODO Auto-generated method stub
		return boardMapper.insertWritter(b);
	}

	@Override
	public List<Board> selectAll() {
		// TODO Auto-generated method stub
		return boardMapper.selectAll();
	}

	@Override
	public Board selectById(String title) {
		// TODO Auto-generated method stub
		return boardMapper.selectById(title);
	}

	@Override
	public int update(BoardDto b) {
		// TODO Auto-generated method stub
		return boardMapper.update(b);
	}

	@Override
	public int delete(BoardDto b) {
		// TODO Auto-generated method stub
		return boardMapper.delete(b);
	}


	
}
