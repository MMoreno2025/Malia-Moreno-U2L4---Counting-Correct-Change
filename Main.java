//Malia Moreno | 6 September 2024//
package com.mycompany.u2l4correctcashproject;
import java.util.Scanner; //inport scanner for input//

public class U2L4CorrectCashProject {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double totalMoney;

        // Enter money and press Enter
        System.out.print("How much money do you have? \t"); 
        totalMoney = myObj.nextDouble(); 
        
        /*find how many 10 dollor bills you have:
        - first divice total num buy 10 then should get total num
        */
        int tens = (int)(totalMoney/10);
        System.out.println("There are "+tens+" $10 bill(s) in $"+totalMoney);
        
        /*Now I'm going to need to find the total number of $5 bills in the remaining sum after removing the total number of 10 dollar bills*/
        double remainingMoney = totalMoney-(10*tens);
        int fives = (int)(remainingMoney/5);
        System.out.println("and "+fives+" $5 bill(s) in $"+totalMoney);
        
        /*Now I'm going to need to find the remining $1 bills from the remaining money*/
        remainingMoney = remainingMoney-(5*fives);
        int ones = (int)(remainingMoney/1);
        System.out.println("and "+ones+" $1 bill(s) in $"+totalMoney);
        
        //now, in order to get this to work, I'm going to need to see how many remaining cents there are and work from there//
        double totalCents = (remainingMoney-(1*ones)+0.001);
        totalCents = (int)(totalCents*100)/1; //this is making sure no decimal points are remining//
        
        //now how many quarters//
        int quarters = (int)(totalCents/25);    //just dividing the total number of cents by 0.25*100 since the decimal point is *100//
        System.out.println("and "+quarters+" quarters in $"+totalMoney);
        
        //now how many dimes//
        double remainingCents = totalCents-(25*quarters);   //this part is removing the quarers from the equation to see the remaining cents//
        int dimes = (int)(remainingCents/10);
        System.out.println("and "+dimes+" dimes in $"+totalMoney);
        
        //now how many nickles//
        remainingCents = remainingCents-(10*dimes);
        int nickles = (int)(remainingCents/5);
        System.out.println("and "+nickles+" nickles in $"+totalMoney);
        
        
        //now how many pennies//
        remainingCents = remainingCents-(5*nickles);
        int pennies = (int)(remainingCents/1);
        System.out.println("and "+pennies+" pennies in $"+totalMoney);      
        
        System.out.println("\n\nThere you go");
    }
}
