package com.example.demo.hal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.hal.domain.Hall;
import com.example.demo.hal.repository.HallRepository;

import lombok.RequiredArgsConstructor;
@Service @RequiredArgsConstructor
public class HallServiceImpl extends AbstractService<Hall>
								implements HallService{
	private final HallRepository repo;
	
	@Override
	public int save(Hall t) {
		return (repo.save(t)!=null)?1:0;
	}

	@Override
	public int delete(Hall t) {
		repo.delete(t);
		return (getOne(t.getHallNum())==null)?1:0;
	}

	@Override
	public int count() {
		return (int)repo.count();
	}

	@Override
	public Hall getOne(int id) {
		return repo.getOne(id);
	}

	@Override
	public Optional<Hall> findById(int id) {
		return repo.findById(id);
	}

	@Override
	public boolean existsById(int id) {
		return repo.existsById(id);
	}

	@Override
	public List<Hall> findAll() {
		return repo.findAll();
	}
	
	
}
