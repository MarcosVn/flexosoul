package br.com.flexosoul.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.dao.UsuarioDao;
import br.com.flexosoul.model.Usuario;
import br.com.flexosoul.dao.Dao;
/**
 * @author Samara Cardoso
 *
 */

public class ServletsUtil {
	public static final String CONSULTA_JSP = "consulta.jsp";
	public static final String CONSULTA_SERVLET = "consultarUsuarios";

	public static void saveOrUpdateUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idUsuario = 0;
		if (request.getParameter("id") != null) {
			idUsuario = Integer.parseInt(request.getParameter("id"));
		}

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String email = request.getParameter("email");
		
        Dao usuarioDao = new UsuarioDao();
        Usuario usuario = null;

		

		if (idUsuario != 0) {
			usuario = usuarioDao.find(idUsuario);
		} else {
			usuario = new Usuario();
		}

		usuario.setNome(nome);
		usuario.setSobrenome(sobrenome);
		usuario.setEmail(email);
	}
}
