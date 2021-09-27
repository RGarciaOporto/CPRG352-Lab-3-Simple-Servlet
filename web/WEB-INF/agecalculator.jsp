<%-- 
    Document   : agecalculator
    Created on : Sep 23, 2021, 3:40:44 PM
    Author     : 851649
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method ="POST" action="age">
        <label>Enter your age:</label>
        <input type="text" name="age"> 
        <br>
        
        <input type="submit" value="Age next birthday">
        <br>
        </form>
        
        <p>${message} ${nextAge}</p>
    </body>
</html>
