/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceprogram;

import java.util.Random;

/**
 *
 * @author agsharp
 */
public class Dice {
    
    private int sides;
    
    public Dice(int sides)  
	{
            this.sides = sides;
	}
    
    public int RollDice(){
        int rolledvalue;
        Random rand = new Random();
        rolledvalue = rand.nextInt(sides)+1; 
        return rolledvalue;
    } 
    
}
