package pe.udu.upeu.ventas.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.udu.upeu.ventas.dao.UsuarioDao;
import pe.udu.upeu.ventas.daoImp.UsuarioDaoImp;
import pe.udu.upeu.ventas.entity.Usuario;


/**
 * Servlet implementation class UsuarioController
 */
@WebServlet("/uc")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDao udao = new UsuarioDaoImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text html; charset = ISO-8859-1");
		String user = request.getParameter("nombre");
		String clave = request.getParameter("clave");
		Usuario u = udao.validarUsuario(user, clave);
		if(u.getNomuser() != null) {
			request.getRequestDispatcher("home.jsp").forward(request, response);
			request.setAttribute("usuario", u);
		}else {
			request.getRequestDispatcher("index.html").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
