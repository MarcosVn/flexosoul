package br.com.flexosoul.categoria.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.categoria.dao.CategoriaDao;
import br.com.flexosoul.model.Categoria;
import br.com.flexosoul.servlets.util.ServletUtils;

/**
 * 
 * @author marcos
 *
 */
@WebServlet("/categoriaServlet")
public class SalvarCategoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/indexCategoria.jsp");
		rd.forward(request, response);
		
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String categoriaStr = request.getParameter("descricao");
		
		if(!ServletUtils.temParametroNulo(request.getParameterMap())) {
			CategoriaDao dao = new CategoriaDao();
			dao.salvar(new Categoria(nome, categoriaStr));
		}
	}
}
