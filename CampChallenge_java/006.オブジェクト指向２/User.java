/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author AI
 */
public class User extends Human{
    ArrayList<Integer> cards     = new ArrayList<>();
    ArrayList<Integer> usercard  = new ArrayList<>();
    ArrayList<Integer> hitcard   = new ArrayList<>();
    
    
    //Dealerにカード52枚をセット
    public void Initialization(){
        for(int i=0;i<4;i++){
            for(int j =1;j<14;j++){
                if(j>10){
                 this.cards.add(10);   
                }else{
                    this.cards.add(j);
                }
            }
        }
    }
    
    //ランダムで2枚引く
    public ArrayList<Integer> deal(){
        
        Random rand = new Random();
        for(int i=0;i<2;i++){
            int index = rand.nextInt(52);
            this.usercard.add(this.cards.get(index));
        }
        return this.usercard;
    }
    //ランダムで1枚引く
    public ArrayList<Integer> hit(){
        Random rand = new Random();
        int index = rand.nextInt(52);
        this.hitcard.add(this.cards.get(index));
        return this.hitcard;
    }

    @Override
    public void setCard(ArrayList set) {
            SubCards.addAll(set);
    }
    @Override
    public boolean checkSum() {

        int sum = open();
        if(sum<17){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public int open() {
        int i   =   0;
        int sum =   0;
        for(Integer check :SubCards){
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
    

