package com.example.demo.brd.controller;

import java.time.LocalDate;    
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;   
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.brd.domain.Board;
import com.example.demo.brd.domain.BoardDto;
import com.example.demo.brd.repository.BoardRepository;
import com.example.demo.brd.service.BoardService;
import com.example.demo.brd.service.BoardServiceImpl;

import lombok.RequiredArgsConstructor;




@RestController
@RequiredArgsConstructor
@RequestMapping("/boards") 
public class BoardController {
	final BoardRepository boardRepository;
	final BoardService boardService;

	
	@PostMapping("/writter")
    public Map<?, ?> writter(@RequestBody BoardDto b) {
		String date = String.format("%s %s", LocalDate.now(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("a HH�떆 mm遺�")));
		System.out.println(date);
        var map = new HashMap<>();
       
      map.put("message", (boardService.insertWritter(b) == 1) ? "SUCCESS" : "FAILURE");
        return map;
    }
	
	@GetMapping("/list")
    public List<Board> list(){
        return boardService.selectAll();
    }
	
	@GetMapping("/{title}")
	public Board det(@PathVariable String title) {
		return  boardService.selectById(title);
	}	
	
	@PutMapping("/update")
	public Map<?, ?> update(@RequestBody BoardDto b){
		var map = new HashMap<>();
		String date = String.format("%s %s", LocalDate.now(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("a HH�떆 mm遺�")));
		
		 
		map.put("message",boardService.update(b) == 1 ? "SUCCESS" : "FAILURE");
		return map;
	}
	
	@DeleteMapping("/remove")
	public Map<?, ?> remove(@RequestBody BoardDto b){
		var map = new HashMap<>();
		 map.put("message",boardService.delete(b) == 1 ? "SUCCESS" : "FAILURE");
		 return map;
		
	}
	

	
}
