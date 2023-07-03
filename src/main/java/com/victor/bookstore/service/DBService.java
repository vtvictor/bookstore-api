package com.victor.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.bookstore.domain.Categoria;
import com.victor.bookstore.domain.Livro;
import com.victor.bookstore.repositories.CategoriaRepository;
import com.victor.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBancoDeDados() {
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Ficção Cientifica", "Livros de Ciência");
		Categoria cat3 = new Categoria(null, "História", "Livros de História");

		Livro livro1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
		Livro livro2 = new Livro(null, "Física 1", "Victor", "Teste1", cat2);
		Livro livro3 = new Livro(null, "Introdução a História", "Fernanda", "Teste3", cat3);

		cat1.getLivros().addAll(Arrays.asList(livro1, livro2));
		cat1.getLivros().addAll(Arrays.asList(livro3));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(livro1, livro2, livro3));
	}
}
