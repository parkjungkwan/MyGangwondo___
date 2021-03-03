package com.example.demo.mem.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.mem.domain.Member;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class MemberRepositoryImpl extends QuerydslRepositorySupport 
									implements IMemberRepository{
	private final JPAQueryFactory qf;
	public MemberRepositoryImpl(JPAQueryFactory qf) {
		super(Member.class);
		this.qf = qf;
	}

}
