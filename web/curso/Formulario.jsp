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
        <h2>Registrar Cursos</h2>
        <s:form action="cursoSave">
            <s:textfield label="Nrc" name="cur.curNrc" />
            <s:textfield label="Nombre" name="cur.curNombre" />
            <s:textfield label="Semestre" name="cur.curSemestre" />
            <s:textfield label="Duracion" name="cur.curDuracion" />
            <s:submit value="Registrar"/>
        </s:form>
    </body>
</html>
