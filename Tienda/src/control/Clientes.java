package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Cliente;
import datos.DAOCliente;

/**
 * Servlet implementation class Clientes
 */
@WebServlet("/Clientes")
public class Clientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String operacion;
		
		try{
			operacion = request.getParameter("operacion");
			DAOCliente op = new DAOCliente();
			System.out.println("---- operacion: "+operacion);
			
			if(operacion.equals("alta")){
				Cliente c = recogerDatos(request);
				op.Alta(c);
				request.setAttribute("cliente", c);
				System.out.println("---- nombre: "+c.getNombre());
				System.out.println("---------------------alta");
				RequestDispatcher rd = request.getRequestDispatcher("cliente.jsp");
                rd.forward(request, response);
			}
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("--------------------  FALLO  -----------------------------");
            e.printStackTrace();
            System.out.println("----------------------------------------------------------");
		}
		
		
	}

	private Cliente recogerDatos(HttpServletRequest request) {
		Cliente c = new Cliente();
		c.setNombre_usuario(request.getParameter("nombre_usuario"));
		c.setNombre(request.getParameter("nombre"));
		c.setApellidos(request.getParameter("apellidos"));
		c.setCorreo(request.getParameter("correo"));
		c.setDireccion(request.getParameter("direccion"));
		return c;
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

