package br.com.flexosoul.dao;

import java.util.List;

import br.com.flexosoul.model.Usuario;

/**
 * @author Samara Cardoso
 *
 */

public interface Dao {
	public void salvar(Usuario usuario);
	public List<Usuario> pesquisar(String nome);
	public Usuario find(int idUsuario);
	void excluir(Usuario usuario);
	void editar(Usuario usuario);
}
