package br.com.flexosoul.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.dao.CategoriaDao;

/**
 * 
 * @author marcos
 *
 */
@WebServlet("/excluirCategoria")
public class ExcluirCategoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		this.doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int idCategoria = Integer.parseInt(request.getParameter("categoria"));
		
		CategoriaDao categoriaDao = new CategoriaDao();
		categoriaDao.excluir(categoriaDao.pesquisarPorId(idCategoria).getId());
		
		RequestDispatcher rd = request.getRequestDispatcher("consultarCategoria");
		rd.forward(request, response);
	}
}
