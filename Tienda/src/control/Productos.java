package control;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import beans.Producto;
import datos.DAOProducto;

/**
 * Servlet implementation class Productos
 */
@WebServlet("/Productos")
@MultipartConfig
public class Productos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Productos() {
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
				System.out.println("Entra");
				List<Producto> list = dp.Listado();
				for(int i = 0; i < list.size(); i++){
					System.out.println("Lista");
					System.out.println(list.get(i).toString());
				}
				request.setAttribute("productos", list);
				request.getRequestDispatcher("/listado.jsp").forward(request, response);
			} else if(operacion.equals("busqueda")){
				
			} else if(operacion.equals("listadoNuevos")){
				List<Producto> listNuevos = dp.ListadoNuevos();
				for(int i = 0; i < listNuevos.size(); i++){
					System.out.println("Lista");
					System.out.println(listNuevos.get(i).toString());
				}
				request.setAttribute("nuevos", "Nuevos");
				request.setAttribute("productos", listNuevos);
				RequestDispatcher view = request.getRequestDispatcher("/listado.jsp");
				view.forward(request, response);
			} else if(operacion.equals("buscar")){
				System.out.println("ENTRANDO EN BUSCAR");
				String nombre = request.getParameter("producto");
				List <Producto> listaBuscar = dp.buscarProdcuto(nombre);
					for(int i = 0; i < listaBuscar.size(); i++){
						System.out.println("Lista");
						System.out.println(listaBuscar.get(i).toString());
					}
				
		    	  if(listaBuscar!=null){
		    	   request.setAttribute("nuevos", "por: " + nombre);
		    	   request.setAttribute("productos", listaBuscar);
		    	   request.getRequestDispatcher("/listado.jsp").forward(request, response);
		    	  }else{
		    	   PrintWriter out=response.getWriter();
		    	   out.println("Error, no se encontro el producto.");
		    	  }
			
			}
			
			
		} catch (Exception e) {
			System.out.println("--------------------  FALLO  -----------------------------");
            e.printStackTrace();
            System.out.println("----------------------------------------------------------");
		}
		
		
		
		
		
	}
	
	
	private Producto recogerDatos(HttpServletRequest request) {
		Producto p = new Producto();
		p.setNombre(request.getParameter("nombre"));
		p.setMarca(request.getParameter("marca"));
		p.setDescripcion(request.getParameter("descripcion"));
		p.setPrecio(Double.parseDouble(request.getParameter("precio")));
		p.setExistencia(Integer.parseInt(request.getParameter("existencia")));
		p.setImagen((request.getParameter("imagen")));
		return p;
		
		
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
