/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

/**
 *
 * @author AI
 */
@WebServlet(name = "BlackJack", urlPatterns = {"/BlackJack"})
public class BlackJack extends HttpServlet {

    
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
        
            //実体化
            Dealer dealer   =   new Dealer();
            User    user    =   new User();
            String br       =   "<br/>";
            
            //カード52枚セット
            dealer.Initialization();
            
            //ディーラーが2枚カードを引く
            dealer.setCard(dealer.deal());
            dealer.dRemove();
            //ユーザーが2枚カードを引く
            user.setCard(dealer.deal());
            
            //ディーラーカード引くかどうかチェック
            while(dealer.checkSum()){
                dealer.setCard(dealer.hit());
                dealer.hRemove();
            }
            //ユーザーカード引くかどうかチェックh
            while(user.checkSum()){
                user.setCard(dealer.hit());
                dealer.hRemove();
            }
            
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BlackJack</title>");            
            out.println("</head>");
            out.println("<body>");
            //ディーラーカード
            out.println("ディーラーのカードは"+(dealer.MyCards)+"です。"+(br));
            //ユーザーカード
            out.println("ユーザーのカードは"+(user.MyCards)+"です。"+(br));
            //合計出力
            out.println("ディーラーの合計は"+(dealer.open())+"です。"+(br));
            out.println("ユーザーの合計は"+(user.open())+"です。"+(br));
            //比較
            if((dealer.open()>21)&&(user.open()>21)){
                out.println("バストしました。引き分けです。"+(br));
            }else if(dealer.open()>21){
                out.println("ディーラーバストしました。ユーザーの勝利です。"+(br));
            }else if(user.open()>21){
                out.println("ユーザーバストしました。ディーラーの勝利です。"+(br));
            }else if(dealer.open()>user.open()){
                out.println("ディーラーの勝利です。"+(br));
            }else if(user.open()>dealer.open()){
                out.println("ユーザーの勝利です。"+(br));
            }else if(dealer.open()==user.open()){
                out.println("引き分けです。"+(br)); 
            }
            dealer.MyCards.clear();
            user.MyCards.clear();
            out.println("</body>");
            out.println("</html>");
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
