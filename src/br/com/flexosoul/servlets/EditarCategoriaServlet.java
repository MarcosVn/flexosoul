package br.com.flexosoul.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.dao.CategoriaDao;
import br.com.flexosoul.model.Categoria;

/**
 * 
 * @author marcos
 *
 */
@WebServlet("/editarCategoria")
public class EditarCategoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!ServletUtils.temParametroNulo(request.getParameterMap())) {
			String nome = request.getParameter("nome");
			String descricao = request.getParameter("descricao");
			int id = Integer.parseInt(request.getParameter("id"));

			
			new CategoriaDao().editar(new Categoria(id, nome, descricao));
			
			RequestDispatcher rd = request.getRequestDispatcher("consultarCategoria");
			rd.forward(request, response);
		}	
	}
}
