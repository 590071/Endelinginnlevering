package no.hvl.dat100;

import java.util.Scanner;

public class O3fakultet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int n;
        boolean gyldig;
        
        do {
            System.out.print("n:");
            n = scanner.nextInt();
            gyldig = n > 0;
            
            
            
            if (!gyldig) {
                System.out.println("Ugyldig sum, prøv igjen.");
            }
        } while(!gyldig);
        
        int Svar = 1;
        
        for (int i = 1; i <= n; i++) {
        	Svar *= i;
        }
        
        System.out.println(Svar);
        
        scanner.close();
    }
    
}