package br.com.flexosoul.produto.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.categoria.dao.CategoriaDao;
import br.com.flexosoul.model.Categoria;
import br.com.flexosoul.produto.dao.ProdutoDao;
import br.com.flexosoul.produto.model.Produto;
import br.com.flexosoul.servlets.util.ServletUtils;
/**
 * 
 * @author marcos
 *
 */
@WebServlet("/salvarProduto")
public class SalvarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Categoria> listaCategorias = new CategoriaDao().pesquisarAllCategorias();
		request.setAttribute("listaCategoria", listaCategorias);
		
		this.doPost(request, response);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/indexProduto.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!ServletUtils.temParametroNulo(request.getParameterMap())){
			String nome = request.getParameter("nome");
			String categoriaId = request.getParameter("categoria");
			String descricao = request.getParameter("descricao");
			
			ProdutoDao dao = new ProdutoDao();
			dao.salvar(new Produto(nome, descricao, Integer.parseInt(categoriaId)));
		}		
	}
}
