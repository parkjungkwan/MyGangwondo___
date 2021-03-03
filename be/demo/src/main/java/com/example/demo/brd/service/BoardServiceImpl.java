package com.example.demo.brd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.brd.domain.Board;
import com.example.demo.brd.repository.BoardRepository;
import com.example.demo.cmm.service.AbstractService;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class BoardServiceImpl extends AbstractService<Board>
    							implements BoardService{
	private final BoardRepository repo;
	
	@Override public Board save(Board m) { return repo.save(m);}
	@Override public void delete(Board m) { repo.delete(m);}
	@Override public int count() {return (int) repo.count();}
	@Override public Board getOne(int id) {return repo.getOne(id);}
	@Override public Optional<Board> findById(int id) {return repo.findById(id);}
	@Override public boolean existsById(int id) {return repo.existsById(id);}
	@Override public List<Board> findAll() {return repo.findAll();}
}

