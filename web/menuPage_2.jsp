<%-- 
    Document   : menuPage
    Created on : Sep 15, 2014, 8:16:42 PM
    Author     : bholewinski
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.MenuItem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    Object obj = request.getAttribute("menuItems");
    if (obj == null) {
        response.sendRedirect("MainController?action=getOriginalList");
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>      
        <h1>Restaurant Menu!</h1>

        <form id="form1" name="form1" method="POST" action="MainController?action=processOrder">
            <select name="menuItemSelected">
                <c:forEach var="item" items="${menuItems}" varStatus="rowCount">
                    <option value="${item.name}, ${item.price}">${item.name}, ${item.price}</option>
                </c:forEach>
            </select>
            
            <button type="submit" name="submit">Submit</button>
        </form>
    </body>
</html>
