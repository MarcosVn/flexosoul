package br.com.flexosoul.produto.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.produto.dao.ProdutoDao;

/**
 * 
 * @author marcos
 *
 */
@WebServlet("/excluirProduto")
public class ExcluirProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int idProduto = Integer.parseInt(request.getParameter("produto"));
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.excluir(produtoDao.pesquisarPorId(idProduto).getId());
		
		RequestDispatcher rd = request.getRequestDispatcher("consultarProduto");
		rd.forward(request, response);
	}
}
