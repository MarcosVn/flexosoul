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
@WebServlet("/consultarUsuarios")
public class ConsultarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void service(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    	this.doGet(request, response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    
    	UsuarioDao usuarioDao = new UsuarioDao();
		request.setAttribute("listaUsuarios", 
				usuarioDao.pesquisar(request.getParameter("nomeConsulta")));
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/consultaUsuario.jsp");
		rd.forward(request, response);
    }
}
