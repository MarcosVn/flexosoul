package br.com.flexosoul.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		ServletsUtil.saveOrUpdateUsuario(request, response);
	}

}
