package br.com.flexosoul.model;

/**
 * 
 * @author marcos
 *
 */
public class Usuario {
	private int id;
	private String nome;
	private String sobrenome;
	private String email;
	private String senha;
	
	
	public Usuario(int id, String nome, String sobrenome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.senha = senha;
	}
	
	public Usuario(String nome, String sobrenome, String email, String senha) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.senha = senha;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
}
