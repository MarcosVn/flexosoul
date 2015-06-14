package br.com.flexosoul.produto.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.produto.dao.ProdutoDao;
import br.com.flexosoul.produto.model.Produto;

/**
 * 
 * @author marcos
 *
 */
@WebServlet("/editarProduto")
public class EditarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void service(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String idCat = request.getParameter("categoria");
		String descricao = request.getParameter("descricao");
		int id = Integer.parseInt(request.getParameter("id"));
			
		new ProdutoDao().editar(new Produto(id, nome, descricao, Integer.parseInt(idCat)));
		
		RequestDispatcher rd = request.getRequestDispatcher("consultarProduto");
		rd.forward(request, response);
	}
}
