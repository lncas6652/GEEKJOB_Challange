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
                if(j>10){
                 this.cards.add(10);   
                }else{
                    this.cards.add(j);
                }
            }
        }
    }
    

    //ランダムで2枚引き、cardsから引いたカードは削除
    public ArrayList<Integer> deal(){        
        Random rand = new Random();
        for(int i=0;i<2;i++){
            int index = rand.nextInt(cards.size());
            this.dealcard.add(this.cards.get(index));
            cards.remove(index);
        }
        return this.dealcard;
    }
    //ランダムで1枚引き、cardsから引いたカードは削除
    public ArrayList<Integer> hit(){
        Random rand = new Random();
        int index = rand.nextInt(cards.size());
        this.hitcard.add(this.cards.get(index));
        cards.remove(index);
        return this.hitcard;
    }
    //dealカードリセット
    public void dRemove(){
        this.dealcard.clear();
    }
    //hitカードリセット
    public void hRemove(){
        this.hitcard.clear();
    }
    //dealerカードをセット
    @Override
    public void setCard(ArrayList set) {
        MyCards.addAll(set);
    }
    //delaer引くかどうかをチェック
    @Override
    public boolean checkSum() {
        int sum = open();
        if(sum<17){
            return true;
        }else{
            return false;
        }
    }
    //dealerカード合計値の返還
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