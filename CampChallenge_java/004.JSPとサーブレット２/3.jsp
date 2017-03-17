<%-- 
    Document   : 3
    Created on : 2017/03/17, 14:33:35
    Author     : AI
--%>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            //メソッド
            String Judge (Integer x){
                if(x%2==1){
                      return "奇数です。";
                }else return "偶数です。";  
        }   
        %>
        <%
            Random  rand = new Random();
            int  n = rand.nextInt(10)+1;
            out.print(n+"は"+Judge(n));
        %>
    </body>
</html>
