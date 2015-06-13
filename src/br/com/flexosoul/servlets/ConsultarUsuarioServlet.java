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


/**
 * @author Samara Cardoso
 *
 */


@WebServlet("/consultarUsuarios")
public class ConsultarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ConsultarUsuarioServlet() {
        super();
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    	this.doGet(request, response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	String nome = request.getParameter("nomeConsulta");
    	
    	UsuarioDao userDao = new UsuarioDao();
    	List<Usuario> listaUsuarios = userDao.pesquisar(nome);
    	
		request.setAttribute("listaUsuarios", listaUsuarios);
		
		RequestDispatcher rd = request.getRequestDispatcher(ServletsUtil.CONSULTA_JSP);
		rd.forward(request, response);
    }
}
