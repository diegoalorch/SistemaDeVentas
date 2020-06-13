package pe.udu.upeu.ventas.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.google.gson.Gson;

import pe.udu.upeu.ventas.dao.ProductoDao;
import pe.udu.upeu.ventas.daoImp.ProductoDaoImp;

/**
 * Servlet implementation class CompraController
 */
@WebServlet("/con")
public class CompraController extends HttpServlet {
	private ProductoDao productoDao = new ProductoDaoImp();
	Gson gson = new Gson();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompraController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("op"));
		switch (op) {
		case 1:
			out.println(gson.toJson(productoDao.buscar(Integer.parseInt(request.getParameter("codigo")))));
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
