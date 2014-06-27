<%-- 
    Document   : Formulario
    Created on : Jun 22, 2014, 11:41:21 PM
    Author     : jahd
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        </br>
        <h2>Reporte de Contactos Registrados</h2>
        <br/>
        <s:url id="url" action="contactoInput"/>
        <s:a href="%{url}">Nuevo Contacto</s:a>
        <br/>
        <s:form action="contactoSearch">
            <s:textfield name="q" />
            <s:submit value="Buscar"/>
        </s:form>
         <s:url id="url" action="contactoList"/>
        <s:a href="%{url}">Todos</s:a>
        <br/>
        <table border="1">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Direccion</th>
                    <th>Telefono</th>
                    <th>Correo</th>
                    <th>Opciones</th>
                </tr>
            </thead>
            <tbody>
            <s:iterator value="lstContactos">
                <tr>
                    <td><s:property value="id"/></td>
                    <td><s:property value="nombre"/></td>
                    <td><s:property value="direccion"/></td>
                    <td><s:property value="telefono"/></td>
                    <td><s:property value="correo"/></td>
                    <td>
                        <!--s:url id="url" action="contactoInput">-->
                        <s:url id="url" action="contactoRemove">
                            <s:param name="id" value="id"/>
                        </s:url>
                        <s:a href="%{url}">Eliminar</s:a>
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>

    </body>
</html>
