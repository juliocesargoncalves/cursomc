package com.julio.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julio.cursomc.domain.Categoria;
import com.julio.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
		
		@Autowired
		private CategoriaRepository repo;
		
		public Categoria buscar(Integer id) {
			
			Optional<Categoria> result = repo.findById(id);
			
			return result.orElse(null);
		}
	
}
