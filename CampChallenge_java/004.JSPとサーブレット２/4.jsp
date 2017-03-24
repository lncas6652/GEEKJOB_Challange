<%-- 
    Document   : 4
    Created on : 2017/03/17, 15:41:11
    Author     : AI
--%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            Integer getNum(Integer x,Integer y,boolean z){
            int r = x*y;
            if(z==false){
                r*=r;
            }
            return r;
            }  
        %>
        <%
        Random rand = new Random();
        int x=rand.nextInt(10)+1;//0~10
        int y=5;
        boolean z = false;
        out.println("xは"+x+",yは5"+",zはfalse"+"="+getNum(x,y,z));
        %>
    </body>
</html>
