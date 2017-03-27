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
public abstract class Human { 
    //カードセット用のArrayList
    ArrayList<Integer> MyCards  = new ArrayList<>();
    
    //抽象メソッド　カードを開き合計表示
    public abstract int open();
    //抽象メソッド　カードをセット
    public abstract void setCard(ArrayList set);
    //抽象メソッド  カードを引くかどうか判断
    public abstract boolean checkSum();
}
