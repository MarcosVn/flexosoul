package br.com.flexosoul.servlets;

import java.io.IOException;
import java.util.List;

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
@WebServlet("/consultarCategoria")
public class ConsultarCategoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ConsultarCategoriaServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		
		if(!ServletsUtil.temParametroNulo(request.getParameterMap())) {
			CategoriaDao cat = new CategoriaDao();
			List<Categoria> lstCategorias =  cat.pesquisar(nome);
			
			request.setAttribute("listaCategorias", lstCategorias);
			
			RequestDispatcher rd = request.getRequestDispatcher("consultaCategoria.jsp");
			rd.forward(request, response);
		}		
	}
}
