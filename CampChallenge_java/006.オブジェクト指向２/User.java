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
    
    

    @Override
    public int open() {
        int i   =   0;
        int sum =   0;
        for(Integer check :MyCards){
            sum += check;
            if(check==1){
                i++;
            }
        }
        if(sum+i*10<22){
            sum = sum + i * 10;
        }

        return sum;
    }

    @Override
    public void setCard(ArrayList set) {
            MyCards.addAll(set);
    }

    @Override
    public boolean checkSum() {
        int sum = open();
        if(sum<18){
            return true;
        }else return false;
        }
    }
    
    

