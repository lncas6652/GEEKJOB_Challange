<%-- 
    Document   : 8
    Created on : 2017/03/17, 18:40:03
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
            List.put(513,"井上,1955/06/05,神奈川県在住");
            return List.get(id);
        }   
        %>
        
        <%
            String br = "<br>";
            for(int i=511;i<514;i++){
                if(getID(i)!=null){
                    out.println(getID(i)+br);
                }else{
                    continue;
                }
            }
        %>
    </body>
</html>
