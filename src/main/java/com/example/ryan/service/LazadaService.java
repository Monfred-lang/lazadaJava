package com.example.ryan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ryan.lazada.LazadaEntity;
import com.example.ryan.repo.LazadaRepo;

@Service
public class LazadaService {
	private final LazadaRepo lazadaRepo;

	@Autowired
	public LazadaService(LazadaRepo lazadaRepo) {
		this.lazadaRepo = lazadaRepo;
	}
	
	public LazadaEntity addLazada(LazadaEntity lazada) {
		return lazadaRepo.save(lazada);
	}
	
	public List<LazadaEntity> getAllLazada() {
		return lazadaRepo.findAll();
	}
	
	public void deleteLazada(Long id) {
		 lazadaRepo.deleteById(id);
	}
	
	
	
}
