/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package surfsup;
import java.util.Scanner;
/**
 * Noah Hinderle, Tuesday, September 13
 * Prompts the user for wave height for 
 * surfing and then tells the user if they 
 * should surf.
 */
public class SurfsUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("How high are the waves? (In feet)");
        Scanner sc = new Scanner(System.in);
        double waveHeight = sc.nextDouble();
        
        //if the waveHeight is equal to or greater than 6 feet this message is displayed.
        if(waveHeight >= 6){
            System.out.println("Great day for surfing!");
        
        //if the waveHeight is in between 3 and 6 feet this message is displayed.    
        }else if(waveHeight >= 3 && waveHeight <=6){
            System.out.println("Go body boarding instead");
        
        //if the waveHeight  is between 0 and 3 feet this message is displayed
        }else if(waveHeight >= 0 && waveHeight < 3){
            System.out.println("Go for a swim");
        
        //if the waveHeight is below 0 feet this message is displayed
        }else{
            System.out.println("Whoa, what kind of surf is that?");
        }
        
    }
    
}
