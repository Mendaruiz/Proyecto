
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BBDD(CRUD) [EL + JDBC + DAO]</title>
</head>
<body>
<div id="contenedor">
            <h2>PROYECTO</h2>
            <div id="body">        
                <h3>LISTADO DE PRODUCTOS</h3>
                <table border="1">
                    <thead>
                        <tr>
                            <th>NOMBRE</th>
                            <th>MARCA</th>
                            <th>DESCRIPCION</th>
                            <th>PRECIOUNIT</th>
                            <th>EXISTENCIAS</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="producto" items="${productos}">
                            <tr>
                                <td>${producto.p_nombre}</td>
                                <td>${producto.p_marca}</td>
                                <td>${producto.p_descripcion}</td>
                                <td>${producto.p_preciounit}</td>
                                <td>${producto.p_existencia}</td>
                                
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>


                <br/>
                <br/>
                <div id="listado"></div>
            </div>
        </div>
</body>
</html>