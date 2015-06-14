package br.com.flexosoul.user.model;

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
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setEmail(email);
		this.setSenha(senha);
	}
	
	public Usuario(String nome, String sobrenome, String email, String senha) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setEmail(email);
		this.setSenha(senha);
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
