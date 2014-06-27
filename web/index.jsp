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
        <h1>AUTOR: Jairo Honorio Diaz</h1>
        <s:url id="url" action="cursoList"/>
        <s:a href="%{url}"> Mantenimiento de Cursos </s:a>
        <br/>
        <s:url id="url" action="contactoList"/>
        <s:a href="%{url}"> Mantenimiento de Contactos </s:a>
        <br/>
        <h4>Ingeniería Web - 2014</h4>
    </body>
</html>
