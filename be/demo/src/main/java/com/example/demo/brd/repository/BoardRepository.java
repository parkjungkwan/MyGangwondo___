package com.example.demo.brd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.brd.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Integer>{
}
