package com.example.demo.brd.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;

@Entity  @Getter
@NamedQuery(
name = "Board.findByTitle",
query = "select b from Board b where b.title like :title")
@NamedQuery(
name = "Board.findByWrittenDate",
query = "select b from Board b where b.written_date like :writtenDate")
public class Board {
	@Id @Column(name="board_num") private int boardNo;
	@Column(name="title") private String  title;
	@Column(name="content") private String content;
	@Column(name="written_date") private String writtenDate;
	
	


}
