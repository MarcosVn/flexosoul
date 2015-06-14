package br.com.flexosoul.produto.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.categoria.dao.CategoriaDao;
import br.com.flexosoul.model.Categoria;
import br.com.flexosoul.produto.dao.ProdutoDao;

/**
 * 
 * @author marcos
 *
 */
@WebServlet("/consultarProduto")
public class ConsultarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		request.setAttribute("listaProduto", 
				produtoDao.pesquisar(request.getParameter("nomeConsulta")));
			
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/consultaProduto.jsp");
		rd.forward(request, response);
	}
}
