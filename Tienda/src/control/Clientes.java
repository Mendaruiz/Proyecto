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

		String operacion;
        try {
            // Comprobamos el tipo de accion que se solicita
            operacion = request.getParameter("operacion");
            DAOCliente cli = new DAOCliente();

            if (operacion.equals("baja")) {
                // BAJA
            	String cod = request.getParameter("nombreUsuario");
                cli.Baja(cod);
            }
            
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
		doGet(request, response);
	}
}
