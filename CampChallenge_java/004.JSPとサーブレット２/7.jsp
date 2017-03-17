<%-- 
    Document   : 7
    Created on : 2017/03/17, 17:23:41
    Author     : AI
--%>
<%@page import="java.util.HashMap" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
        String getID(int id){
            HashMap<Integer,String> List = new HashMap <Integer,String>();
            List.put(511,"柏原,1992/11/23,埼玉県在住");
            List.put(512,"佐藤,1987/06/05,東京都在住");
            List.put(513,"井上,1955/06/05,神奈川県在住");
            if(List.get(id) != null){
                return List.get(id);
            }else{
                return "該当はありません。";
            }
        }
        %>
        
        <%
            int i = 511;
            String br = "<br>";
            out.println(getID(i)+br);
            
        %>
    </body>
</html>
