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
@WebServlet("/Productos")
public class Productos extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String operacion;
		
		try{
			
			operacion = request.getParameter("operacion");
			DAOProducto op = new DAOProducto();
			
			if(operacion.equals("listado")){
				List<Producto> list = op.Listado();
				for(int i = 0; i < list.size(); i++){
					System.out.println("Lista");
					System.out.println(list.get(i).toString());
				}
				request.setAttribute("productos", list);
				RequestDispatcher view = request.getRequestDispatcher("/listado.jsp");
				view.forward(request, response);
			}
			
			if(operacion.equals("listadoNuevos")){
				List<Producto> listNuevos = op.ListadoNuevos();
				for(int i = 0; i < listNuevos.size(); i++){
					System.out.println("Lista");
					System.out.println(listNuevos.get(i).toString());
				}
				request.setAttribute("productos", listNuevos);
				RequestDispatcher view = request.getRequestDispatcher("/listadoNuevos.jsp");
				view.forward(request, response);
			}
		} catch (Exception e){
			System.out.println("--------------------  FALLO  -----------------------------");
			e.printStackTrace();
            System.out.println("----------------------------------------------------------");
		}
	}
	
	 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        doPost(request, response);
	    }
}
