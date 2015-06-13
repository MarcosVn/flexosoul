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
@WebServlet("/consultarCategoria")
public class ConsultarCategoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		CategoriaDao categoriaDao = new CategoriaDao();
		request.setAttribute("listaCategorias", 
				categoriaDao.pesquisar(request.getParameter("nomeConsulta")));
			
		RequestDispatcher rd = request.getRequestDispatcher("consultaCategoria.jsp");
		rd.forward(request, response);
				
	}
}
