package com.example.ryan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ryan.lazada.LazadaEntity;
import com.example.ryan.service.LazadaService;

@CrossOrigin(origins = {"http://localhost:4200"}, methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE})
@RestController
@RequestMapping("/lazada")
public class LazadaController {
	private final LazadaService lazadaService;

	@Autowired
	public LazadaController(LazadaService lazadaService) {
		this.lazadaService = lazadaService;
	}
	
//	@CrossOrigin
	@PostMapping("/add")
	public String addLazada(@RequestBody LazadaEntity lazada) {
		lazadaService.addLazada(lazada);
		return "Successfully added";
	}
	
	@CrossOrigin
	@GetMapping("/get")
	public List<LazadaEntity> getAllLazada() {
		return lazadaService.getAllLazada();
	}
	
	@CrossOrigin
	@DeleteMapping("/delete/{id}")
	public String deleteItem(@PathVariable Long id) {
		lazadaService.deleteLazada(id);
		return "Successfully deleted.";
	}
	
	

}
