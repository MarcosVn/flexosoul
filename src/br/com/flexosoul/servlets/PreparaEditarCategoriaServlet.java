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
@WebServlet("/preparaEditarCategoria")
public class PreparaEditarCategoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PreparaEditarCategoriaServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idCategoria = Integer.parseInt(request.getParameter("categoria"));
		
		CategoriaDao categoriaDao = new CategoriaDao();
		Categoria categoria = categoriaDao.pesquisarPorId(idCategoria);

		request.setAttribute("categoria", categoria);
		
		RequestDispatcher rd = request.getRequestDispatcher("editarCategoria.jsp");
		rd.forward(request, response);
	
	}
}
