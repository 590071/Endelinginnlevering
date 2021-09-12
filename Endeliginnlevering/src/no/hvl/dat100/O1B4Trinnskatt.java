package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1B4Trinnskatt {

    public static void main(String[] args) {
        
        String input = showInputDialog("Din bruttoinntekt:");
        int bruttoinntekt = parseInt(input);
        
        int trinn1 = 184800;
        int trinn2 = 260100;
        int trinn3 = 651250;
        int trinn4 = 1021550;
        
        double trinnskatt;
        
        if (bruttoinntekt >= 0 && bruttoinntekt <= 184800) {
            System.out.println("Bruttoinntekt kr " + bruttoinntekt + " ingen trinnskatt ");
        } else if (bruttoinntekt > 184800 && bruttoinntekt <= 260100) {
            trinnskatt = (bruttoinntekt - trinn1) * 0.017;
            System.out.println("Trinnskatt kr " + bruttoinntekt + "er kr" + trinnskatt);
        } else if (bruttoinntekt > 260100 && bruttoinntekt <= 651250) {
            trinnskatt = ((bruttoinntekt - trinn2) * 0.04) 
                    + ((trinn2 - trinn1) * 0.017);
            System.out.println("Trinnskatt kr " + bruttoinntekt + "er kr" + trinnskatt);
        } else if (bruttoinntekt > 651250 && bruttoinntekt <= 1021550) {
            trinnskatt = ((bruttoinntekt - trinn3) * 0.132) 
                    + ((bruttoinntekt - trinn2) * 0.04) 
                    + ((trinn2 - trinn1) * 0.017);
            System.out.println("Trinnskatt kr " + bruttoinntekt + "er kr" + trinnskatt);
        } else if (bruttoinntekt > 1021550) {
            trinnskatt = ((bruttoinntekt - trinn4) * 0.162) 
                    + ((bruttoinntekt - trinn3) * 0.132) 
                    + ((bruttoinntekt - trinn2) * 0.04) 
                    + ((trinn2 - trinn1) * 0.017);
            System.out.println("Trinnskatt kr " + bruttoinntekt + "er kr" + trinnskatt);
        }
        
    }

}