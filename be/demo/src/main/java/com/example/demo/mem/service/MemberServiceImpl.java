package com.example.demo.mem.service;

import java.util.Map; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mem.domain.Member;
import com.example.demo.mem.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl {
	final MemberRepository memberRepository;
	
	public int join(Member m) {
		
		return memberRepository.insert(m);
	}
	public Member login(Member m) {
	
		return memberRepository.selectById(m);
	}
	public int modify(Member m) {
		
		return memberRepository.update(m);
	}
	public int withdrawal(Member m) {
		
		return memberRepository.delete(m);
	}
	public Member getMember(String memid) {
		return null;
	}

}
