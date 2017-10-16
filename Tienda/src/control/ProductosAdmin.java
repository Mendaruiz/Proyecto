package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Producto;
import datos.DAOProducto;

/**
 * Servlet implementation class ProductosAdmin
 */
@WebServlet("/admin/ProductosAdmin")
public class ProductosAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductosAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String operacion;
		try{
			operacion = request.getParameter("operacion");
			DAOProducto dp = new DAOProducto();
			System.out.println("---- operacion: "+operacion);
			if(operacion.equals("listado")){
				List<Producto> listNuevos = dp.ListadoNuevos();
				for(int i = 0; i < listNuevos.size(); i++){
					System.out.println("Lista");
					System.out.println(listNuevos.get(i).toString());
				}
				request.setAttribute("productos", listNuevos);
				RequestDispatcher view = request.getRequestDispatcher("/listado.jsp");
				view.forward(request, response);
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
