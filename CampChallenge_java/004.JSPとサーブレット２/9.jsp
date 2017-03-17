<%-- 
    Document   : 9
    Created on : 2017/03/17, 18:56:56
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
            List.put(0,"柏原,1992/11/23,埼玉県在住");
            List.put(2,"井上,1955/06/05,神奈川県在住");
            return List.get(id);
        }   
        %>
        
        <%
            String br = "<br>";
            for(int i=0;i<3;i++){
                if(getID(i)!=null){
                    out.println(getID(i)+br);
                }else{
                    break;
                }
            }
        %>
    </body>
</html>

