<%-- 
    Document   : newjsp
    Created on : 2017/03/17, 14:08:09
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
        <%!
        //名前メソッド定義
        String getProfile(){
            return "柏原一博<br>1992/11/23<br>勉強中です。<br>";
        }
        %>
        <%
            String br=("<br>");
            for(int i=0;i<10;i++){
                out.print(getProfile()+br+br);
            }
         %>
            
    </body>
</html>
