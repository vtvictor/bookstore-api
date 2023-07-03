package com.victor.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.bookstore.domain.Categoria;
import com.victor.bookstore.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository; 
	
	public Categoria findById(Integer Id) {
		Optional<Categoria> obj = repository.findById(Id);
		return obj.orElse(null);
	}
	
}
