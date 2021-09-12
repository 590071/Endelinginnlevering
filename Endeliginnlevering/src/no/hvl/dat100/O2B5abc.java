package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import java.util.Scanner;

public class O2B5abc {

    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
        	
        
        	String input = showInputDialog("Poengsum");
        	boolean gyldig;
        	int poengsum = parseInt(input);
        	
        	do {
                System.out.print("Poengsum: ");
                poengsum = scanner.nextInt();
                
                gyldig = poengsum >= 0 && poengsum <= 100;
                
                if (!gyldig) {
                    System.out.println("Ugyldig poengsum");
                }
            } while(!gyldig);
        	
        			if(poengsum >= 0 && poengsum < 40) {
        				System.out.println("F");       				
        			
        			} else if (poengsum >= 40 && poengsum < 50) {
        				System.out.println("E");
        			
        			} else if (poengsum >= 50 && poengsum < 60) {
        				System.out.println("D");
    				
        			} else if (poengsum >= 60 && poengsum < 80) {
    					System.out.println("C");
					
        			} else if (poengsum >= 80 && poengsum < 90) {
						System.out.println("B");
					
        			} else if (poengsum >= 90 && poengsum < 100) {
						System.out.println("A");
					
					} else {
			            System.out.println("Ugyldig poengsum");
			            scanner.close();
			    		
			 }
        			
		}
        			
        			
   }
        
        
}
