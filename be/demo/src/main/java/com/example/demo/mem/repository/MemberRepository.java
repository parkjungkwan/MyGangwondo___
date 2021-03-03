package com.example.demo.mem.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mem.domain.Member;
interface IMemberRepository{
	
}
public interface MemberRepository extends JpaRepository<Member, Integer>,
										IMemberRepository{

}
