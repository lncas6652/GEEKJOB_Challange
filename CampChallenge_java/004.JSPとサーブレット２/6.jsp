<%-- 
    Document   : 6
    Created on : 2017/03/17, 16:51:37
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
            String[] getID(){
            String Data[] = {"5116","柏原","1992/11/23","埼玉県"};
            return Data;
        }
        %>
        
        <%
;           String br = "<br>";
            String id[];
            id = getID();
            for(int i=1;i<4;i++){
                out.println(id[i]);
            }

        %>
            
    </body>
</html>
