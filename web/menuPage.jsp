<%-- 
    Document   : menuPage
    Created on : Sep 15, 2014, 8:16:42 PM
    Author     : bholewinski
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.MenuItem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Object obj = request.getAttribute("menuItems");
    if(obj == null) {
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
        <h1>Hello World!</h1>
        
        <select>
            <%
                List<MenuItem> items = new ArrayList<MenuItem>();
                Object obj2 = request.getAttribute("menuItems");
                if(obj2 != null) {
                    items = (List<MenuItem>) obj;
                }
                
                for(MenuItem item : items) {
                    out.println("<option value='" + item.getName()
                        + ", " + item.getPrice() + "'>"
                        + item.getName() + ", " + item.getPrice()
                        + "</option>");
                }
            %>
            
        </select>
    </body>
</html>
