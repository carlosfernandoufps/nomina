package nomina.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import nomina.entities.Empleado;
import nomina.model.empleadoDao;

/**
 * Servlet implementation class consultaController
 */
@WebServlet("/consultaController")
public class consultaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public consultaController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 * empleadoDao empDao = new empleadoDao(); request.setAttribute("empDao",
		 * empDao); request.getRequestDispatcher("/resultadojsp").forward(request,
		 * response);
		 */
		
		String codigo = request.getParameter("codigo");
		empleadoDao empDao = new empleadoDao();
		Empleado emp = new Empleado();

		emp.setCodigo(codigo);
		Empleado x = empDao.find(emp.getCodigo());

		System.out.println(x.getNombre());

		request.setAttribute("empleado", x);

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/resultados.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		

	}

}
