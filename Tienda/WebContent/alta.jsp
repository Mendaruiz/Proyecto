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
            <div id="body">        
                <h3>ALTA DE UN PAIS</h3>
                <form action="Clientes?operacion=alta" method="POST">
                    <table border="1">
                        <tbody>
                        	<tr>
                                <td>Nombre de Usuario</td>
                                <td><input type="text" name="nombre_usuario" value="" size="10" /></td>
                            </tr>
                            <tr>
                                <td>Nombre</td>
                                <td><input type="text" name="nombre" value="" size="18" /></td>
                            </tr>
                            <tr>
                                <td>Apellidos</td>
                                <td><input type="text" name="apellidos" value="" size="40" /></td>
                            </tr>
                            <tr>
                                <td>Correo</td>
                                <td><input type="text" name="correo" value="" size="30" /></td>
                            </tr>
                            <tr>
                                <td>Direccion</td>
                                <td><input type="text" name="direccion" value="" size="60" /></td>
                            </tr>
                        </tbody>
                    </table>
                    <input type="submit" value="Enviar" />
                </form>
            </div>
        </div>
</body>
</html>