<%-- 
    Document   : newjsp
    Created on : 2017/03/13, 13:49:39
    Author     : AI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    //課題Ⅵ
    int type    =   Integer.parseInt(request.getParameter("type"));
    int count   =   Integer.parseInt(request.getParameter("count"));
    int total   =   Integer.parseInt(request.getParameter("total"));
    int tanka   =   total / count;
    double point;
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        if(type==1){
            out.println("雑貨です。" + "<br>");
        }else if(type==2){
            out.println("生鮮食品です。" + "<br>");
        }else if(type==3){
            out.println("その他です。" + "<br>");
        }else{
            out.println("登録されていません。" + "<br>");
        }
        out.println("総額は" + total + "です。<br>" + "単価は" + tanka + "です。<br>");
        
        if(total>=3000){
            point = (double)total * 0.04;
            out.println(point + "ポイント付与しました。");
        }else if(total>=5000){
            point = (double)total * 0.05;
            out.println(point + "ポイント付与しました。");
        }
        
        %>

    </body>
</html>
