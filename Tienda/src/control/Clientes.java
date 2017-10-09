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
			/* Funciona
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
			}*/
			operacion = request.getParameter("operacion");
			DAOCliente op = new DAOCliente();
			System.out.println("---- operacion: "+operacion);
			
			if(operacion.equals("alta")){
				Cliente c = recogerDatos(request);
				op.Alta(c);
				System.out.println(c.toString());
				System.out.println("---- nombre: "+c.getNombre());
				System.out.println("---------------------alta");
				request.getSession().setAttribute("cliente", c);
				response.sendRedirect("cliente/index.jsp");
			}else if(operacion.equals("login")){
				
				String usuario = request.getParameter("nombre_usuario");
				String contraseña = request.getParameter("contrasena");
				
				System.out.println(usuario + " " + contraseña);
				
				if(op.ComprobarLogin(usuario, contraseña)){
					Cliente c = op.getClienteUserName(usuario);
					request.getSession().setAttribute("cliente", c);
					response.sendRedirect("cliente/index.jsp");
				}
				else{
					RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
					rd.forward(request, response);
				}
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
		c.setContraseña(request.getParameter("contrasena"));
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

