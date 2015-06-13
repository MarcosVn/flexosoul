/**
 * 
 */
package br.com.flexosoul.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.flexosoul.connection.ConnectionFactory;
import br.com.flexosoul.model.Categoria;

/**
 * @author marcos
 *
 */
public class CategoriaDao {
	private final String INSERT = "INSERT INTO categoria (nome, descricao) values(?,?)";
	private final String CONSULTA = "SELECT * FROM categoria";
	private final String EXCLUIR = "DELETE FROM categoria WHERE id = ?";
	private final String EDITAR = "UPDATE categoria SET nome = ?, descricao = ? WHERE id = ?";
	
	private ConnectionFactory factory;

	public CategoriaDao() {
		factory = new ConnectionFactory();
	}

	/**
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	private Categoria buildCategoriaFromResultSet(ResultSet rs)
			throws SQLException {
		
		return new Categoria(
				rs.getInt("id"),
				rs.getString("nome"),
				rs.getString("descricao"));
	}
	
	
	
	public List<Categoria> pesquisarAllCategorias() {
		List<Categoria> categorias = new ArrayList<>();
		try {
			Connection connection = factory.createConnection();
			PreparedStatement st = connection.prepareStatement(CONSULTA);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				categorias.add(buildCategoriaFromResultSet(rs));
			}
			
			rs.close();
			st.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return categorias;
	}
	
	/**
	 * 
	 * @param categoria
	 */
	public void salvar(Categoria categoria) {
		Connection conexao = null;
		
		try {
			conexao = factory.createConnection();

			PreparedStatement st = conexao.prepareStatement(INSERT);
			st.setString(1, categoria.getNome());
			st.setString(2, categoria.getDescricao());
			st.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conexao != null)
				try {
					conexao.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	/**
	 * 
	 * @param nome
	 * @return
	 */
	public List<Categoria> pesquisar(String nome) {
		List<Categoria> categorias = new ArrayList<>();
		try {
			Connection connection = factory.createConnection();

			String sql = CONSULTA.concat((nome != null && !nome.isEmpty()) ? String.format(
					" where nome like '%%%s%%'", nome) : "");
			PreparedStatement st = connection.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				categorias.add(buildCategoriaFromResultSet(rs));
			}
			
			rs.close();
			st.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return categorias;
	}

	/**
	 * 
	 * @param idProduto
	 * @return
	 */
	public Categoria pesquisarPorId(int idCategoria) {
		Categoria categoria = null;
		try {
			Connection connection = factory.createConnection();

			String sql = CONSULTA.concat(" where id = ?");
			PreparedStatement st = connection.prepareStatement(sql);
			st.setInt(1, idCategoria);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				categoria = buildCategoriaFromResultSet(rs);
			}
			rs.close();
			st.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return categoria;
	}

	/**
	 * 
	 * @param id
	 */
	public void excluir(int id) {
		try {
			Connection connection = factory.createConnection();
			PreparedStatement st = connection.prepareStatement(EXCLUIR);
			st.setInt(1, id);
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * 
	 * @param categoria
	 */
	public void editar(Categoria categoria) {
		try {
			Connection connection = factory.createConnection();
			PreparedStatement st = connection.prepareStatement(EDITAR);
			st.setString(1, categoria.getNome());
			st.setString(2, categoria.getDescricao());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
