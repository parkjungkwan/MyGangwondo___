package com.example.demo.brd.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.brd.domain.Board;
import com.example.demo.brd.domain.BoardDto;
import com.example.demo.mem.domain.Member;
import com.querydsl.jpa.impl.JPAQueryFactory;
@Repository
public class BoardRepositoryImpl extends QuerydslRepositorySupport 
						implements IBoardRepository{
	private final JPAQueryFactory qf;
	private final EntityManager em;
	public BoardRepositoryImpl(JPAQueryFactory qf, EntityManager em) {
		super(Board.class);
		this.qf = qf;
		this.em = em;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Board> findByTitle(String title) {
		return em.createNamedQuery("Board.findByTitle")
				.setParameter("title", title)
				.getResultList();
	}
}
