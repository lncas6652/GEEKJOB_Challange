/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NormalClass;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.text.*;
import java.io.*;

/**
 *
 * @author AI
 */
@WebServlet(name = "n1", urlPatterns = {"/n1"})
public class n1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet n1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet n1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            //br変数宣言
            String br = "<br/>";
            
            //課題①
            //2016年1月1日 0時0分0秒のタイムスタンプを作成し、表示してください。
            //Calendarインスタンスを取得する為に、getInstanceというメソッドを用いる
            //Calendarクラスは抽象クラスな為、getInstance()メソッドを用いてインスタンス生成する
            Calendar calendar = Calendar.getInstance();
            //Calendar型変数Calendarに2016年1月1日の時刻を設定
            calendar.set(2016,1,1,0,0,0);
            //Date型を変数宣言
            Date date1;
            //CalendarClassのgetTime()メソッドからDate型のオブジェクトを戻り値として取得し、date1に格納
            date1 = calendar.getTime();
            //Data型のオブジェクトをタイムスタンプ型に変換し、出力
            out.println(date1.getTime() + br);
            
            
            //課題②
            //現在の日時を「年-月-日 時:分:秒」で表示してください。
            //変数宣言
            Date date2 = new Date();
            //日付フォーマット：SimpleDateFromatインスタンス生成
            SimpleDateFormat genjikoku = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
            //現在時間をgenjikokuフォーマットに引数として渡し、戻り値をString型変数genzaiに代入
            String genzai = genjikoku.format(date2);
            out.println(genzai + br);
            
            
            //課題③
            //2016年11月4日 10時0分0秒のタイムスタンプを作成し、
            //「年-月-日 時:分:秒」で表示してください。
            //データ型変数宣言
            Date date3;
            //Calendar型インスタンス生成
            Calendar calendar1 = Calendar.getInstance();
            //calendar1に日付をセット
            calendar1.set(2016,11,4,10,0,0);
            //calendar1をデータ型のオブジェクトとして戻り値で取得し、date3に格納
            date3 = calendar1.getTime();
            //フォーマット変換、上記genjikokuを使用する。
            String jikokuhenkan = genjikoku.format(date3);
            out.println(date3.getTime() + ":" + jikokuhenkan + br);
            
            
            //課題④
            //2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）を表示してください。
            Calendar r1 = Calendar.getInstance();
            r1.set(2016,1,1,0,0,0);
            //1月1日の日付をlong型ミリ秒での取得
            long tuitati = r1.getTimeInMillis();
            
            Calendar r2 = Calendar.getInstance();
            r2.set(2015,12,31,23,59,59);
            //12月31日の日付をlong型ミリ秒での取得
            long oomisoka = r2.getTimeInMillis();

            out.println(tuitati - oomisoka + br);
            
            
            //課題⑤
            //自分の氏名について、バイト数と文字数を取得して、表示してください。
            String simei = "柏原一博";
            out.println("氏名：柏原一博" + br + "氏名の文字数：" + simei.length() + "　　　氏名のByte数：" + simei.getBytes().length + br);
            
            
            //課題⑥
            //自分のメールアドレスの「@」以降の文字を取得して、表示してください。
            //String型メールアドレス
            String mail = "lncas6652@gmail.com";
            //@の登場番目取得　indexOf()メソッド利用(※indexOf()は登場文字直前までの数となる）
            int bansusyutoku = mail.indexOf("@") + 1;
            //bansusyutoku以降の文字列を取得　substring()メソッドを利用(xと入力した場合、x+1からの文字を取得)
            String domein = mail.substring(bansusyutoku);
            out.println(domein + br);
            
            //課題⑦
            //以下の文章の「I」⇒「い」に、「U」⇒「う」に入れ替える処理を作成し、結果を表示してください。
            //「きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます」
            String mojihenkan = "「きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます」";
            String mojihenkango = mojihenkan.replace("U","う");
                   mojihenkango = mojihenkango.replace("I","い");

            out.println("文字列変換前：" + mojihenkan + br + "文字列変換後：" + mojihenkango);
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
