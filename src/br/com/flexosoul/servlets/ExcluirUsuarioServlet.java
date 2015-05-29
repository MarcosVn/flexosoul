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

import br.com.flexosoul.dao.Dao;
import br.com.flexosoul.dao.UsuarioDao;
/**
 * @author Samara Cardoso
 *
 */

@WebServlet("/ExcluirUsuario")
public class ExcluirUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExcluirUsuarioServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idUsuario = Integer.parseInt(request.getParameter("usuario"));
		
		Dao usuarioDao = new UsuarioDao();
		
		Usuario usuario = usuarioDao.find(idUsuario);
		
		usuarioDao.excluir(usuario);
		
		RequestDispatcher rd = request.getRequestDispatcher(ServletsUtil.CONSULTA_SERVLET);
		rd.forward(request, response);
	}

}
