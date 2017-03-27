/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;
import java.util.ArrayList;

/**
 *
 * @author AI
 */
public class User extends Human{
    
    //userカードセット
    @Override
    public void setCard(ArrayList set) {
            MyCards.addAll(set);
    }
    //user引くかどうかのチェック
    @Override
    public boolean checkSum() {
        int sum = open();
        if(sum<17){
            return true;
        }else{
            return false;
        }
    }
    //user合計値の算出
    @Override
    public int open() {
        int sum =   0;
        for(Integer check :MyCards){
            sum = sum + check;
            if(check==1){
                if(sum+10<22){
            sum = sum + 10;
                }
            }
        }
        return sum;
    }
}    
    

