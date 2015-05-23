package br.com.flexosoul.servlets;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.dao.CategoriaDao;
import br.com.flexosoul.model.Categoria;
import br.com.flexosoul.utils.Utils;
/**
 * 
 * @author marcos
 *
 */
@WebServlet("/categoriaServlet")
public class SalvarCategoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
		
		RequestDispatcher rd = request.getRequestDispatcher("categoria.jsp");
		rd.forward(request, response);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String categoriaStr = request.getParameter("descricao");
		
		if(!Utils.temParametroNulo(request.getParameterMap())) {
			CategoriaDao dao = new CategoriaDao();
			dao.salvar(new Categoria(nome, categoriaStr));
		}
	}
}
