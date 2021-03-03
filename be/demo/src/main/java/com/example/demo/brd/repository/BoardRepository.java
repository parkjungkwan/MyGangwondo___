package com.example.demo.brd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.brd.domain.Board;
interface IBoardRepository{
	public List<Board> findByTitle(String title);
}
public interface BoardRepository extends JpaRepository<Board, Integer>,
										IBoardRepository{
}
