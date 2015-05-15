package br.com.flexosoul.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.dao.ProdutoDao;
import br.com.flexosoul.model.Categoria;
import br.com.flexosoul.model.Produto;
/**
 * 
 * @author marcos
 *
 */
@WebServlet("/produtoServlet")
public class SalvarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("produto.jsp");
		rd.forward(request, response);
		
		this.doPost(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		String produtoTipo = request.getParameter("categoria");
		
		/**
		 * fiz essa gambeta só pra não dar erro, ver com o prof como tratar
		 * requisições que serão objetos
		 */
		Categoria cat = (Categoria)(Object)produtoTipo;
		
		ProdutoDao dao = new ProdutoDao();
		dao.salvar(new Produto(nome, descricao, cat));
				
	}
}
