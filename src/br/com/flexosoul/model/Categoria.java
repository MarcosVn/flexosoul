package br.com.flexosoul.model;

/**
 * @author marcos
 *
 */
public class Categoria {
	private int id;
	private String nome;
	private String descricao;
	
	public Categoria(int id, String nome, String descricao) {
		this.setId(id);
		this.nome = nome;
		this.descricao = descricao;
	
	}
	public Categoria(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
