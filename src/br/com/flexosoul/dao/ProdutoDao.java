package br.com.flexosoul.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.flexosoul.connection.ConnectionFactory;
import br.com.flexosoul.model.Categoria;
import br.com.flexosoul.model.Produto;

/**
 * @author marcos
 *
 */
public class ProdutoDao {
	private final String INSERT = "INSERT INTO produto values(null,?,?,?,?)";
	private final String CONSULTA = "select * from produto";
	private final String EXCLUIR = "DELETE FROM produto WHERE id = ?";
	private final String EDITAR = "UPDATE produto SET nome = ?, descricao = ?, "
			+ "tipo = ? WHERE id = ?";
	
	private ConnectionFactory factory;

	public ProdutoDao() {
		factory = new ConnectionFactory();
	}

	/**
	 * Por enquanto não considerei as imagens no dao
	 */
	

	/**
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	private Produto buildProdutoFromResultSet(ResultSet rs)
			throws SQLException {
		
		Categoria cat = (Categoria)rs.getObject("categoria");
		
		return new Produto(rs.getString("nome"),
				rs.getString("descricao"), 
				cat);
	}
	
	/**
	 * 
	 * @param produto
	 */
	public void salvar(Produto produto) {
		Connection conexao = null;
		try {
			conexao = factory.createConnection();

			PreparedStatement st = conexao.prepareStatement(INSERT);
			st.setString(1, produto.getNome());
			st.setString(2, produto.getDescricao());
			st.setObject(3, produto.getProdutoTipo());
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
	public List<Produto> pesquisar(String nome) {
		List<Produto> produtos = new ArrayList<>();
		try {
			Connection connection = factory.createConnection();

			String sql = CONSULTA.concat((nome != null && !nome.isEmpty()) ? String.format(
					" where nome like '%%%s%%'", nome) : "");
			PreparedStatement st = connection.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				produtos.add(buildProdutoFromResultSet(rs));
			}
			
			rs.close();
			st.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produtos;
	}

	/**
	 * 
	 * @param idProduto
	 * @return
	 */
	public Produto pesquisarPorId(int idProduto) {
		Produto produto = null;
		try {
			Connection connection = factory.createConnection();

			String sql = CONSULTA.concat(" where id = ?");
			PreparedStatement st = connection.prepareStatement(sql);
			st.setInt(1, idProduto);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				produto = buildProdutoFromResultSet(rs);
			}
			rs.close();
			st.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produto;
	}

	
	public void excluir(Produto produto) {
		try {
			Connection connection = factory.createConnection();
			PreparedStatement st = connection.prepareStatement(EXCLUIR);
			st.setInt(1, produto.getId());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void editar(Produto produto) {
		try {
			Connection connection = factory.createConnection();
			PreparedStatement st = connection.prepareStatement(EDITAR);
			st.setString(1, produto.getNome());
			st.setString(2, produto.getDescricao());
			st.setObject(3, produto.getProdutoTipo());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
