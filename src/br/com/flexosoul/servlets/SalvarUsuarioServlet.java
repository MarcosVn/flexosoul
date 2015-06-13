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
@WebServlet("/salvarUsuario")
public class SalvarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SalvarUsuarioServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("indexUsuario.jsp");
		rd.forward(request, response);
		
		if(!ServletUtils.temParametroNulo(request.getParameterMap())) {
			String nome = request.getParameter("nome");
			String sobrenome = request.getParameter("sobrenome");
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");
			
			UsuarioDao dao = new UsuarioDao();
			dao.salvar(new Usuario(nome,sobrenome,email,senha));
		}	
	}
}
