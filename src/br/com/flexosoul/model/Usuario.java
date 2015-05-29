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
	
	public Usuario(){}
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
