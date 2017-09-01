/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retirement;

import java.util.Scanner;

/**
 *
 * @author Josh
 */
public class Retirement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int year;
        double savings;
        double totalSavings = 0;
        double intersetRate = 0.05;
        double interset;
        
        do{
        System.out.println("How many years of Reitrement: ");
        year = input.nextInt();
        
        }while(year <=0);
        
        do{
        System.out.println("How much do you save: ");
        savings = input.nextDouble();
        
        if(savings <=0){
        System.out.print("You saved nothing in your life\n");
        
        }
        //input.nextLine();
        }while(savings <=0);
        
        for(int x = 0; x < year; x++){
            
        interset = savings * intersetRate;
        
        totalSavings = interset + savings;
        
        }
        
        System.out.println("Number of years retired: " + year);
        System.out.println("Money saved with Interset: " + totalSavings);
    }
    
}
