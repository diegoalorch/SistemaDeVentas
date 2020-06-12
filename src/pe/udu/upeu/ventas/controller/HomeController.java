package pe.udu.upeu.ventas.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/hc")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		switch (action) {
		case "inicio":
			request.getRequestDispatcher("inicio.jsp").forward(request, response);
			break;
		case "mantenimiento":
			request.getRequestDispatcher("mantenimiento.jsp").forward(request, response);
			break;
		case "ventas":
			request.getRequestDispatcher("ventas.jsp").forward(request, response);
			break;
		case "compras":
			request.getRequestDispatcher("compras.jsp").forward(request, response);
			break;
		case "reportes":
			request.getRequestDispatcher("reportes.jsp").forward(request, response);
			break;
		case "backup":
			request.getRequestDispatcher("backup.jsp").forward(request, response);
			break;
		case "configuracion":
			request.getRequestDispatcher("configuracion.jsp").forward(request, response);
			break;

		default:
			break;
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
