<%-- 
    Document   : newjsp
    Created on : 2017/04/03, 16:48:31
    Author     : AI
--%>

<%@page import="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        //課題⑧
        //ファイルに自己紹介を書き出し、保存してください。
        //同じ階層にあるファイルをオープン
        File profile = new File(application.getRealPath("profile.txt"));
        //上書きオブジェクトfwを生成
        FileWriter fw = new FileWriter(profile);
        //上書き処理
        fw.write("柏原一博です。よろしくお願いします。");
        //上書きを終了
        fw.close();
        
        //課題⑨
        //読み込みモードでオブジェクトfr生成
        FileReader fr = new FileReader(profile);
        BufferedReader br = new BufferedReader(fr);
        
        out.print(br.readLine());
        br.close();
        %>
    </body>
</html>
