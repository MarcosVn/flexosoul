package br.com.flexosoul.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.dao.ProdutoDao;
import br.com.flexosoul.model.Produto;
import br.com.flexosoul.utils.Utils;

/**
 * 
 * @author marcos
 *
 */
@WebServlet("/ConsultarProdutoServlet")
public class ConsultarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ConsultarProdutoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		
		if(!Utils.temParametroNulo(request.getParameterMap())) {
			ProdutoDao prod = new ProdutoDao();
			List<Produto> lstProdutos = prod.pesquisar(nome);
			
			request.setAttribute("listaProdutos", lstProdutos);
			
			RequestDispatcher rd = request.getRequestDispatcher("consultaProduto.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
