<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="contenedor">
            <h2>Bienvenido Cliente ${cliente.nombre_usuario}</h2>
            <div id="body">        
                <table border="1">
                    <thead>
                        <tr>
                            <th>NOMBRE</th>
                            <th>APELLIDOS</th>
                            <th>CORREO</th>
                            <th>DIRECCION</th>
                        </tr>
                    </thead>
                    <tbody>
                    	<tr>
                    		<td>${cliente.nombre} </td>
                    		<td>${cliente.apellidos} </td>
                    		<td>${cliente.correo} </td>
                    		<td>${cliente.direccion} </td>
                    	</tr>
                    </tbody>
                </table>

                <br/>
                <br/>
            </div>
        </div>
	
	
</body>
</html>