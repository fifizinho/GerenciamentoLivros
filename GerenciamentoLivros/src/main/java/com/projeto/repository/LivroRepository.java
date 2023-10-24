package com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}