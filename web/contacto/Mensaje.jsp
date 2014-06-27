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
       <h2>Actualizacion Realizada...</h2>
       <s:url id="url" action="contactoList"/>
       <s:a href="%{url}">Reporte de Contactos  </s:a>
    </body>
</html>
