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
 * Servlet implementation class Consultas
 */

@WebServlet(
		name ="Clientes",
		urlPatterns = {"/clientes"},
		asyncSupported = false
)
public class Clientes extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String operacion;
		System.out.println("hola que tal");
        try {
            // Comprobamos el tipo de accion que se solicita
            operacion = request.getParameter("operacion");
            DAOCliente cli = new DAOCliente();

            if (operacion.equals("alta")) {
                //ALTA
                cli.Alta(recogerDatos(request));
                response.sendRedirect("clientes?operacion=listado");
            } else if (operacion.equals("baja")) {
                // BAJA
            	String cod = request.getParameter("nombreUsuario");
                cli.Baja(cod);
                System.out.println(request.getParameter("nombreUsuario"));
                response.sendRedirect("clientes?operacion=confirmacion");
            }
            else if(operacion.equals("confirmacion")){
            	request.setAttribute("clientes","cod");
            	RequestDispatcher view = request.getRequestDispatcher("/confirmacion.jsp");
            	view.forward(request, response);
            }
//            } else if (operacion.equals("detalle")) {
//                // DETALLE
//                /*request.setAttribute("paises", op.Detalle(request.getParameter("cod")));
//                RequestDispatcher view = request.getRequestDispatcher("/detalle.jsp");*/
//                view.forward(request, response);
//            } else if (operacion.equals("modificacion")) {
//                // MODIFICACION
//                request.setAttribute("paises", op.Detalle(request.getParameter("cod")));
//                RequestDispatcher view = request.getRequestDispatcher("/update.jsp");
//                view.forward(request, response);
//            } else if (operacion.equals("update")) {
//                // UPDATE
//                op.Update(recogerDatos(request));
//                response.sendRedirect("paises?operacion=listado");
//            } else if (operacion.equals("listado")) {
//                // LISTADO
//                request.setAttribute("paises", cli.Listado());
//                RequestDispatcher view = request.getRequestDispatcher("/listado.jsp");
//                view.forward(request, response);
//            }

        } catch (Exception e) {
            System.out.println("--------------------  FALLO  -----------------------------");
            e.printStackTrace();
            System.out.println("----------------------------------------------------------");
        }

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hola");
		doGet(request, response);
	}
	
	public Cliente recogerDatos(HttpServletRequest request) {
        Cliente cli = new Cliente();
        cli.setNombre_usuario(request.getParameter("nombreUsuario"));
        cli.setNombre(request.getParameter("nombre"));
        cli.setApellidos(request.getParameter("apellidos"));
        cli.setCorreo(request.getParameter("correo"));
        cli.setDireccion(request.getParameter("direccion"));
        return cli;
    }

}
