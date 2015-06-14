package br.com.flexosoul.user.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.user.dao.UsuarioDao;

/**
 * @author Samara Cardoso
 *
 */
@WebServlet("/excluirUsuario")
public class ExcluirUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		this.doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int idUsuario = Integer.parseInt(request.getParameter("usuario"));
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.excluir(
				usuarioDao.pesquisarPorId(idUsuario).getId());
		
		RequestDispatcher rd = request.getRequestDispatcher("consultarUsuarios");
		rd.forward(request, response);
	}
}
