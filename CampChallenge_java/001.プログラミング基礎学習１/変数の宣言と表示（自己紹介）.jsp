<%-- 
    Document   : 変数の宣言と表示（自己紹介）
    Created on : 2017/03/10, 16:45:30
    Author     : AI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //課題③
            String myname = "kazu";
            int age = 24;
            out.println ( myname + age + "<br>");
            //課題④
            final int teisu = 3;
                  int hensu = 3;
                  int tasi  = teisu + hensu;
                  int hiki  = teisu - hensu;
                  int kake  = teisu * hensu;
                  int wari  = teisu / hensu;
            out.println("足し算" + tasi + "<br>");
            out.println("引き算" + hiki + "<br>");
            out.println("掛け算" + kake + "<br>");
            out.println("割り算" + wari + "<br>");
        %>
    </body>
</html>
