<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 28, 2021, 12:49:54 PM
    Author     : 851649
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form method ="POST" action="arithmetic">
        <label>First Number:</label>
        <input type="text" name="firstNumber"> 
        <br>
        
        <label>Second Number:</label>
        <input type="text" name="secondNumber"> 
        <br>
        
        <input type="submit" name="add" value="+">
        <input type="submit" name="subtract" value="-">
        <input type="submit" name="multiply" value="*">
        <input type="submit" name="modulus" value="%">
        
        <p>Result: ${result} </p>
        <a href="/Lab03_SimpleServlet/age">Age Calculator</a>
    </body>
</html>
