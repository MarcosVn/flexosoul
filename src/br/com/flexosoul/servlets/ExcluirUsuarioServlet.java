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

@WebServlet("/excluirUsuario")
public class ExcluirUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExcluirUsuarioServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idUsuario = Integer.parseInt(request.getParameter("usuario"));
		
		UsuarioDao usuarioDao = new UsuarioDao();
		
		Usuario usuario = usuarioDao.pesquisarPorId(idUsuario);
		
		usuarioDao.excluir(usuario.getId());
		
		RequestDispatcher rd = request.getRequestDispatcher(ServletsUtil.CONSULTA_SERVLET);
		rd.forward(request, response);
	}

}
