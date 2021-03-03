package com.example.demo.hal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.controller.AbstractController;
import com.example.demo.hal.domain.Hall;
import com.example.demo.hal.service.HallServiceImpl;

import lombok.RequiredArgsConstructor;
@RestController @RequiredArgsConstructor
public class HallController extends AbstractController<Hall>{
	private final HallServiceImpl service;
	@Override
	public ResponseEntity<Integer> save(Hall t) {
		return ResponseEntity.ok(service.save(t));
	}

	@Override
	public ResponseEntity<Integer> delete(Hall t) {
		return ResponseEntity.ok(service.delete(t));
	}

	@Override
	public ResponseEntity<Integer> count() {
		return ResponseEntity.ok(service.count());
	}

	@Override
	public ResponseEntity<Hall> getOne(int id) {
		return ResponseEntity.ok(service.getOne(id));
	}

	@Override
	public ResponseEntity<Optional<Hall>> findById(int id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@Override
	public ResponseEntity<Boolean> existsById(int id) {
		return ResponseEntity.ok(service.existsById(id));
	}

	@Override
	public ResponseEntity<List<Hall>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	
}
