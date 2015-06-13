package br.com.flexosoul.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.dao.UsuarioDao;
import br.com.flexosoul.model.Usuario;

/**
 * @author Samara Cardoso
 *
 */

@WebServlet("/editarUsuario")
public class EditarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		int id = Integer.parseInt(request.getParameter("id"));
		
		new UsuarioDao().editar(new Usuario(id,nome,sobrenome,email,senha));
		
		RequestDispatcher rd = request.getRequestDispatcher("consultarUsuarios");
		rd.forward(request, response);
	}

}
