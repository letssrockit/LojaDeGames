package com.generation.lojagames.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@OneToMany (fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	 private List<Produtos> produtos;
	
	@NotNull(message = "A categoria é obrigatória")
	private String nome;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produtos> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produtos> produtos) {
		this.produtos = produtos;
	}

}
