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
    ArrayList<Integer> MyCards  = new ArrayList<>();
    ArrayList<Integer> SubCards = new ArrayList<>();  
    
    public abstract int open();
    
    public abstract void setCard(ArrayList set);
    
    public abstract boolean checkSum();
}
