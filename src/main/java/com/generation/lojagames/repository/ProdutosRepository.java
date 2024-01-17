package com.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojagames.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
    List<Produtos> findAllByCategoria_NomeContainingIgnoreCase(String nomeCategoria);
}

