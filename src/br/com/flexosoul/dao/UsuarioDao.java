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
import br.com.flexosoul.model.Usuario;

/**
 * @author marcos
 *
 */
public class UsuarioDao {
	private final String INSERT = "insert into Usuario values(null,?,?,?,?)";
	private final String CONSULTA = "select * from Usuario";
	private final String EXCLUIR = "DELETE FROM Usuario WHERE id = ?";
	private final String EDITAR = "UPDATE Usuario SET name = ?, lastName = ?, email = ?, password = ? WHERE id = ?";
	
	private ConnectionFactory factory;

	public UsuarioDao() {
		factory = new ConnectionFactory();
	}

	/**
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	private Usuario buildUsuarioFromResultSet(ResultSet rs)
			throws SQLException {
		
		return new Usuario(
				rs.getString("nome"),
				rs.getString("sobrenome"),
				rs.getString("email"),
				rs.getString("senha")
				);
	}
	
	/**
	 * 
	 * @param categoria
	 */
	public void salvar(Usuario usuario) {
		Connection conexao = null;
		
		try {
			conexao = factory.createConnection();

			PreparedStatement st = conexao.prepareStatement(INSERT);
			st.setString(1, usuario.getNome());
			st.setString(2, usuario.getSobrenome());
			st.setString(3, usuario.getEmail());
			st.setString(4, usuario.getSenha());
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
	 * @param name
	 * @return
	 */
	public List<Usuario> pesquisar(String nome) {
		List<Usuario> usuarios = new ArrayList<>();
		try {
			Connection connection = factory.createConnection();

			String sql = CONSULTA.concat((nome != null && !nome.isEmpty()) ? String.format(
					" where name like '%%%s%%'", nome) : "");
			PreparedStatement st = connection.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				usuarios.add(buildUsuarioFromResultSet(rs));
			}
			
			rs.close();
			st.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuarios;
	}

	/**
	 * 
	 * @param idProduto
	 * @return
	 */
	public Usuario pesquisarPorId(int usuarioId) {
		Usuario usuario = null;
		try {
			Connection connection = factory.createConnection();

			String sql = CONSULTA.concat(" where id = ?");
			PreparedStatement st = connection.prepareStatement(sql);
			st.setInt(1, usuarioId);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				usuario = buildUsuarioFromResultSet(rs);
			}
			
			rs.close();
			st.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
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
	public void editar(Usuario usuario) {
		try {
			Connection connection = factory.createConnection();
			PreparedStatement st = connection.prepareStatement(EDITAR);
			st.setString(1, usuario.getNome());
			st.setString(2, usuario.getSobrenome());
			st.setString(3, usuario.getEmail());
			st.setString(4, usuario.getSenha());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
