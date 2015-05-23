package br.com.flexosoul.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexosoul.dao.UsuarioDao;
import br.com.flexosoul.model.Usuario;
import br.com.flexosoul.utils.Utils;

@WebServlet("/ConsultarUser")
public class ConsultarUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ConsultarUser() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		
		if(!Utils.temParametroNulo(request.getParameterMap())) {
			UsuarioDao usuario = new UsuarioDao();
			List<Usuario> lstUsuarios = usuario.pesquisar(nome);
			
			request.setAttribute("listaUsuarios", lstUsuarios);
			RequestDispatcher rd = request.getRequestDispatcher("consultarUsuario.jsp");
			
			rd.forward(request, response);	
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
