<%-- 
    Document   : プログラミングの基礎②10
    Created on : 2017/03/14, 12:13:57
    Author     : AI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        int kazu    =   Integer.parseInt(request.getParameter("num"));//クエストリング
        ArrayList<Integer> insukakunou = new ArrayList<Integer>();//配列
        int i=2;
        int count=kazu;
        
        
        if(count<=1){
            out.println(kazu+"は素数ではありません。");
        }else if(count<10){
            out.println("元の値は"+kazu+"です。");
            while(count!=1){
                if(count%i==0){
                    insukakunou.add(i);
                    count = count / i;
                }else{
                    i++;    
                }
            }
            count = 1;//count初期化
            if(insukakunou.get(0)==kazu){
                out.println(kazu+"は素数です。");
            }else{
                out.println("素因数分解の結果は：");
                for( int val : insukakunou){
                out.println(val+(count != insukakunou.size()?"*":""));
                count++;
                }
                out.println("です。");
            }
        }else{
            out.println("その他の数字です。");
        }
        
        
        
        %>

    </body>
</html>
