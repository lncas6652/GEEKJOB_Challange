<%-- 
    Document   : 5
    Created on : 2017/03/17, 16:28:33
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
        boolean isProfile(){
            return true;
        }
        
        %>
        <%
            String br=("<br>");
            if(isProfile()==true){
            out.print("正しく実行できました。"+br);
            }else{
            out.print("正しく実行できませんでした"+br);
            }
        %>
    </body>
</html>
