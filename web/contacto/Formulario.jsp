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
        <br/>
        <h2>Registrar Contacto</h2>
        <s:form action="contactoSave">
            <s:textfield label="Nombre" name="contacto.nombre" />
            <s:textfield label="Direccion" name="contacto.direccion" />
            <s:textfield label="Telefono" name="contacto.telefono" />
            <s:textfield label="Correo" name="contacto.correo" />
            <s:submit value="Registrar"/>
        </s:form>
    </body>
</html>
