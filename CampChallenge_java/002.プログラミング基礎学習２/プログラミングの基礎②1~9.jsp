<%-- 
    Document   : プログラミングの基礎2
    Created on : 2017/03/13, 19:41:52
    Author     : AI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%//**Hashmap呼び出し**//>>%>
<%@ page import="java.util.HashMap" %>
<%
//プログラミングの基礎２
//変数宣言
//課題①
int    num      = 0;
String message  = " ";
//課題②
char a          = ' ';
//課題③
long hati       = 1;
//課題④
String A        = " ";
//課題⑤
int total       =0;
//課題⑦
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        //プログラミングの基礎２
        //課題①
       switch(num){
        case 1:
            message = "one";
            break;
        case 2:
            message = "two";
            break;
        default:
            message = "想定外";
            break;
       }
        out.println(message+"<br>");
        //課題②
        switch(a){
            case 'A':
                out.println("英語"+"<br>");
                break;
            case 'あ':
                out.println("日本語"+"<br>");
                break;
        }
        //課題③ 
        for(int i=0;i<20;i++){
            hati = hati * 8;
        }
        out.println(hati+"<br>");
        //課題④
        for(int i=0;i<30;i++){
            A = A + ("A");
        }
        out.println(A+"<br>");
        //課題⑤
        for(int i=0;i<=100;i++){
            total = total+i;
        }
        out.println(total+"<br>");
        //課題⑥
        int i=1000;
        while(i>100){
            i = i / 2;
        }
        out.println(i+"<br>");
        //課題⑦
        String G[]  = {"10", "100", "soeda", "hayashi", "-20", "118", "END"}  ; 
        for(i=0;i<7;i++){
        out.println(G[i]+"<br>");
        }
        //課題⑧
        i = 0;
        while(G[i]!="soeda"){
            i++;
        }
        G[i] = "33";
        out.println(G[i]+"<br>");
        //課題⑨
        HashMap<String,String> himoduke =new HashMap<String,String>();
        himoduke.put("1","AAA");
        himoduke.put("hello","world");
        himoduke.put("soeda","33");
        himoduke.put("20","20");
        out.println(himoduke.get("1")+himoduke.get("hello")+himoduke.get("soeda")+himoduke.get("20")+"<br>");
        
        %>
       
        
    </body>
</html>
