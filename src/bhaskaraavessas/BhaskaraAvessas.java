
package bhaskaraavessas;

import java.util.Scanner;


public class BhaskaraAvessas {

  
    public static void main(String[] args) {
       Scanner leitor = new Scanner (System.in);
        
        System.out.print("x1: ");
        double x1 = Double.parseDouble(leitor.nextLine());
        System.out.print("x2: ");
        double x2 = Double.parseDouble(leitor.nextLine());
        System.out.print("c: ");
        double c = Double.parseDouble(leitor.nextLine());
        
        double som = x1 + x2;
        double pro = x1 * x2;
        double a = c / pro;
        double b = -(a * som);
        
        System.out.println(a + " x^2 + " + b + " x + " + c + " = 0");
        
    }
    
}
