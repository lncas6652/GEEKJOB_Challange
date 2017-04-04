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
import java.util.Random;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AI
 */
@WebServlet(name = "n10", urlPatterns = {"/n10"})
public class n10 extends HttpServlet {

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
            out.println("<title>Servlet n10</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet n10 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            //紹介していないJAVAの標準クラスを利用して、処理を作成してください。
            //講義では紹介されていないJAVAの標準クラスはたくさん存在します。
            //１つJAVAの標準クラスを選び、実際にロジックを作成してみてください。
            //また、この処理を作成するに当たり、下記を必ず実装してください。
            //①処理の経過を書き込むログファイルを作成する。
            //②処理の開始、終了のタイミングで、ログファイルに開始・終了の書き込みを行う。
            //③書き込む内容は、「日時　状況（開始・終了）」の形式で書き込む。
            //④最後に、ログファイルを読み込み、その内容を表示してください。
            
            //ランダムクラスを利用し、ログファイルを出力
                        //現在の日時を「年-月-日 時:分:秒」で表示してください。
            //変数宣言
            Date date2 = new Date();
            //日付フォーマット：SimpleDateFromatインスタンス生成
            SimpleDateFormat genjikoku = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
            //現在時間をgenjikokuフォーマットに引数として渡し、戻り値をString型変数genzaiに代入
            String genzai = genjikoku.format(date2);
            //ファイル生成
            File kadai10 =new File("C:\\kadai\\kadai10.txt");
            //ファイルWriter生成
            FileWriter fw = new FileWriter("C:\\kadai\\kadai10.txt");
            //BufferedReaderクラスもBufferedWriterクラスと同じくバッファに入れて処理を高速化するクラスです。
            BufferedReader buff = new BufferedReader(new FileReader(kadai10));
            BufferedWriter buffw = new BufferedWriter(new FileWriter(kadai10));
            //ランダムインスタンスを生成
            Random rand = new Random();
            String br = "<br>";
            buffw.write("ログ記録開始します。"+ br);
            buffw.newLine();
            for(int i=1;i<=10;i++){
                int ran = rand.nextInt(10);
                out.println(ran+ "</br>");
                buffw.write(genzai + "ランダム出力"+ i +"回目のランダム数値"+ran+br);
                buffw.newLine();
            }
            buffw.write("ログ記録終了します。"+ br);
            buffw.close();
            String str;
            while((str = buff.readLine()) != null){
                out.println(str);
            }
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
