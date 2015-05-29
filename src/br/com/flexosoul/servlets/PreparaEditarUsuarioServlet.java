package br.com.flexosoul.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.flexosoul.dao.Dao;
import br.com.flexosoul.dao.UsuarioDao;
import br.com.flexosoul.model.Usuario;

/**
 * @author Samara Cardoso
 *
 */


@WebServlet("/preparaEditarUsuario")
public class PreparaEditarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PreparaEditarUsuarioServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idUsuario = Integer.parseInt(request.getParameter("usuario"));
		
		Dao usuarioDao = new UsuarioDao();
		Usuario usuario = usuarioDao.find(idUsuario);

		request.setAttribute("usuario", usuario);
		
		RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
		rd.forward(request, response);
	}

}