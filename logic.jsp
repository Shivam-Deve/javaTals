<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
    </head>

    <body>
        <% int num1=Integer.parseInt(request.getParameter("num1")); int
            num2=Integer.parseInt(request.getParameter("num2")); // create a writer and write onto client page
            out.println(num1+num2); %>
    </body>

    </html>