<%-- 
    Document   : プログラミングの基礎2
    Created on : 2017/03/13, 20:05:39
    Author     : FRB
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
//変数宣言
int num = 0;
String message = " ";
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
       switch(num){
        case 1:
            message = "one";
            break;
        case 2:
            message = "two";
        default:
            message = "想定外";
       }
        out.println(message);
        %>
    </body>
</html>
