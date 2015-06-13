package br.com.flexosoul.model;

import java.io.File;
import java.util.List;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private int catId;
	private List<File> produtoImagens = null;
	

	public Produto(String nome, String descricao, int catId) {
		this.nome = nome;
		this.descricao = descricao;
		this.setCatId(catId);
	}

	public Produto(int id, String nome, String descricao, int catId) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.setCatId(catId);
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

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}
}
