package nomina.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nomina.entities.Empleado;
import nomina.model.empleadoDao;

/**
 * Servlet implementation class registroController
 */
@WebServlet("/registroController")
public class registroController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public registroController() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		empleadoDao empDao = new empleadoDao();
		request.setAttribute("empDao", empDao);
		request.getRequestDispatcher("/resultadojsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Empleado emp = new Empleado();
		
		String codigo = request.getParameter("codigo");
		String cedula = request.getParameter("cedula");
		String nombre = request.getParameter("nombre");
		
		SimpleDateFormat parseDate = new SimpleDateFormat("mm/dd/yyyy");
		
		String fechanac = request.getParameter("fechanac");
		String fechaing = request.getParameter("fechaing");
		String fecharet = request.getParameter("fecharet");
		
		Date fnac;
		Date fing;
		Date fret;
		try {
			fnac = (Date)parseDate.parse(fechanac);
			fing = (Date)parseDate.parse(fechaing);
			fret = (Date)parseDate.parse(fecharet);
			emp.setCodigo(codigo);
			emp.setCedula(cedula);
			emp.setNombre(nombre);
			emp.setFechaingreso(fnac);  
			emp.setFechanacimiento(fing);
			emp.setFecharetiro(fret);
			empleadoDao empDao = new empleadoDao();
			empDao.insert(emp);
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.forward(request, response);
		} catch (ParseException e) {
		  e.printStackTrace();
		}
		

	}

}
