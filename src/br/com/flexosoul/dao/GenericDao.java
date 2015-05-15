package br.com.flexosoul.dao;

import java.sql.SQLException;
import java.util.List;
/**
 * 
 * @author marcos
 *
 * @param <T>
 */
public interface GenericDao<T> {
	public void inserir(T objeto) throws SQLException;
	public void excluir(T objeto) throws SQLException;
	public void alterar(T objeto) throws SQLException;
	public List<T> buscar(String dao, String filtro) throws SQLException;
}
