package control;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
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
 * Servlet implementation class SubirProducto
 */
@WebServlet("/SubirProducto")
public class SubirProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubirProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DAOProducto dp = new DAOProducto();
		System.out.println("SubirProducto");
		try {
	        FileItemFactory factory = new DiskFileItemFactory();
	        ServletFileUpload upload = new ServletFileUpload(factory);
	        List<FileItem> items = upload.parseRequest(request);
	        System.out.println(request.getParameter("nombre"));
	        String nombre = null, marca = null, descripcion = null, ruta = null;
	        String rutaBD = null;
	        double precio = 0;
	        int cantidad = 0;
	        FileItem fich = null;
	        File fichero = null;
	        String fName = null;
	        
	        System.out.println(items.toString());
	        
	        for (FileItem item : items) {
	        	   String campoForm = item.getFieldName();
	        	   if(item.isFormField()){
	        		   if(campoForm.equals("nombre")){
	        			   System.out.println("nombre");
	        			   nombre = item.getString("UTF-8");
	        		   } else if(campoForm.equals("marca")){
	        			   System.out.println("marca");
	        			   marca = item.getString("UTF-8");
	        		   } else if(campoForm.equals("descripcion")){
	        			   System.out.println("descripcion");
	        			   descripcion = item.getString("UTF-8");
	        		   } else if(campoForm.equals("precio")){
	        			   System.out.println("precio");
	        			   precio = Double.parseDouble(item.getString("UTF-8"));
	        		   } else if(campoForm.equals("existencia")){
	        			   System.out.println("existencia");
	        			   cantidad = Integer.parseInt(item.getString("UTF-8"));
	        		   }
	        	   }
	        	   else if(campoForm.equals("imagen")){
	        		   fich = item;
	        	   }
	        	}
	        if (fich != null) {
	            fName = fich.getName(); // Nombredel fichero(ojocon IE)
	           //ruta = request.getServletContext().getRealPath("\\")+"\\img\\productos\\"+marca+"\\"+fich.getName();
	            ruta = "C:\\Users\\admin\\Desktop\\Proyecto\\WebContent" + request.getServletContext().getContextPath() + "\\img\\prodcutos\\" + marca +"\\" + fich.getName();
	            ruta = ruta.replace("\\" , "/");
	            System.out.println(ruta);
	            rutaBD = marca + "/" + fName;
	            fichero = new File(ruta);
	            System.out.println(fichero.toString());
	            System.out.println(fichero.getAbsolutePath());
	            fich.write(fichero); // (ojocon IE). Fallará
	            Producto p = new Producto(nombre, marca, descripcion, precio, cantidad, rutaBD);
	            dp.Alta(p);
	            request.getRequestDispatcher("../Productos?operacion=listado").forward(request, response); 
	        } else{
	        	
	        	System.out.println("Entra send redirect");
	        	response.sendRedirect("admin/altaArticulo.jsp");
	        	
	        }
	
	        System.out.println("Aqui andamos");
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
