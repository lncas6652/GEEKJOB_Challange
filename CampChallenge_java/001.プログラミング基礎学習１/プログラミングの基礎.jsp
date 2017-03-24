<%-- 
    Document   : 文字の連結表示
    Created on : 2017/03/10, 16:30:15
    Author     : AI
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%
    //以下変数宣言
    //課題Ⅰ文字列の表示
    String talk ="Hello world.";
    //課題Ⅱ文字連結表示
    String g = "groove";
    String t = "-";
    String r = "gear";
    //課題Ⅲ自己紹介
    String myname = "kazu";
    int age = 24;
    //課題ⅳ変数の宣言と表示(四則演算)
    final   int teisu = 3;
            int hensu = 3;
            int tasi  = teisu + hensu;
            int hiki  = teisu - hensu;
            int kake  = teisu * hensu;
            int wari  = teisu / hensu;
    //課題Ⅴ変数の宣言と表示(if)
    String  yes = "「1です！」";
    String  no  = "「プログラミングキャンプです！」"; 
    String  atr = "「その他です！」"; 
    int     p1 = 1;
    int     p2 = 2;
    int     p3 = 0;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>  
            <%-- 課題Ⅰ --%>
            <%=talk%>       <br>
            <%-- 課題Ⅱ--%>
            <%=g+t+r%>      <br>
            <%-- 課題Ⅲ --%>
            <%=myname+age%> <br>
            <%-- 課題Ⅳ --%>
            <%
            out.println("足し算" + tasi + "<br>");
            out.println("引き算" + hiki + "<br>");
            out.println("掛け算" + kake + "<br>");
            out.println("割り算" + wari + "<br>");
            %>
            <%-- 課題Ⅴ --%>
            <%
            //1の場合
            if(p1 == 1){
                out.println(yes);
            }else if(p1 == 2){
                out.println(no);
            }else{
                out.println(atr);
            }
            out.println("<br>");
            //2の場合
            if(p2 == 1){
                out.println(yes);
            }else if(p2 == 2){
                out.println(no);
            }else{
                out.println(atr);
            }
            out.println("<br>");
            //0の場合
            if(p3 == 1){
                out.println(yes);
            }else if(p3 == 2){
                out.println(no);
            }else{
                out.println(atr);
            }
            out.println("<br>");
            %>
    </body>
</html>
