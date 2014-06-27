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
        <h2>Reporte de Cursos Registrados</h2>
        <br/>
        <s:url id="url" action="cursoInput"/>
        <s:a href="%{url}">Nuevo Curso</s:a>
        <br/>
        <table border="1">
            <thead>
                <tr>
                    <th>Nrc</th>
                    <th>Nombre</th>
                    <th>Semestre</th>
                    <th>Duracion</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
            <s:iterator value="lstCur">
                <tr>
                    <td><s:property value="curNrc"/></td>
                    <td><s:property value="curNombre"/></td>
                    <td><s:property value="curSemestre"/></td>
                    <td><s:property value="curDuracion"/></td>
                    <td>
                        <s:url id="url" action="cursoInput">
                            <s:param name="nrc" value="curNrc"/>
                        </s:url>
                        <s:a href="%{url}">Editar</s:a>
                        <s:url id="url" action="cursoRemove">
                            <s:param name="nrc" value="curNrc"/>
                        </s:url>
                        <s:a href="%{url}">Eliminar</s:a>
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>

    </body>
</html>
