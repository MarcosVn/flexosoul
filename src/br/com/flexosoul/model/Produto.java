package br.com.flexosoul.model;

import java.io.File;
import java.util.List;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private ProdutoTipo produtoTipo;
	private List<File> produtoImagens = null;
	
	public Produto() {}
	
	public Produto(String nome, String descricao, ProdutoTipo produtoTipo,
			List<File> produtoImagens) {
		
		this.nome = nome;
		this.descricao = descricao;
		this.produtoTipo = produtoTipo;
		this.produtoImagens = produtoImagens;
	}
	
	public Produto(String nome, String descricao, ProdutoTipo produtoTipo) {
		this.nome = nome;
		this.descricao = descricao;
		this.produtoTipo = produtoTipo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ProdutoTipo getProdutoTipo() {
		return produtoTipo;
	}
	public void setProdutoTipo(ProdutoTipo produtoTipo) {
		this.produtoTipo = produtoTipo;
	}
	public List<File> getEtiquetaImagens() {
		return produtoImagens;
	}
	public void setEtiquetaImagens(List<File> etiquetaImagens) {
		this.produtoImagens = etiquetaImagens;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
