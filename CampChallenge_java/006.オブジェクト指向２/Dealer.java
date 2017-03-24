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
//Humanを継承したDealer
public class Dealer extends Human{
    ArrayList<Integer> cards     = new ArrayList<>();
    ArrayList<Integer> dealcard  = new ArrayList<>();
    ArrayList<Integer> hitcard   = new ArrayList<>();
    
    //Dealerにカード52枚をセット
    public void Initialization(){
        for(int i=0;i<4;i++){
            for(int j =1;j<14;j++){
                if(10<j){
                 this.cards.add(10);   
                }this.cards.add(j);
            }
        }
    }
    //ランダムで2枚引く
    public ArrayList<Integer> deal(){
        
        Random rand = new Random();
        for(int i=0;i<2;i++){
            int index = rand.nextInt(9+1);
            this.dealcard.add(index);
        }
        return this.dealcard;
    }
    //ランダムで1枚引く
    public ArrayList<Integer> hit(){
        Random rand = new Random();
        int index = rand.nextInt(9+1);
        this.hitcard.add(index);
        return this.hitcard;
    }

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

        int     sum = open();
        return  sum < 17;
    }
}    