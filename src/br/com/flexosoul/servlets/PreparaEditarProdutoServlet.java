package br.com.flexosoul.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.dao.CategoriaDao;
import br.com.flexosoul.dao.ProdutoDao;
import br.com.flexosoul.model.Produto;

/**
 * 
 * @author marcos
 *
 */
@WebServlet("/preparaEditarProduto")
public class PreparaEditarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PreparaEditarProdutoServlet() {
        super();
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idProduto = Integer.parseInt(request.getParameter("produto"));
		
		ProdutoDao produtoDao = new ProdutoDao();
		@SuppressWarnings("unused")
		Produto prod = produtoDao.pesquisarPorId(idProduto);
		
		request.setAttribute("listaCategoria", 
				new CategoriaDao().pesquisarAllCategorias());
		request.setAttribute("produto", 
				produtoDao.pesquisarPorId(idProduto));
		
		RequestDispatcher rd = request.getRequestDispatcher("editarProduto.jsp");
		rd.forward(request, response);
	}
}
