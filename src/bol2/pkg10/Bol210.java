
package bol2.pkg10;

import java.util.Scanner;

/**
 *
 * @author julianlinux
 */
public class Bol210 {

    
    public static void main(String[] args) {
        int b100,b20,b5,m1, dineroTotal;
        
        
        
        System.out.println("Dinero total: ");
        Scanner obx=new Scanner(System.in);
        dineroTotal=obx.nextInt();
         b100=dineroTotal/100;
        b20=dineroTotal%100/20;
        b5=dineroTotal%100%20/5;
        m1=dineroTotal%100%20%5;
        
        System.out.println("Billetes de 100€:"+b100);
        System.out.println("Billetes de 20€:"+b20);
        System.out.println("Billetes de 5€:"+b5); 
        System.out.println("Monedas de 1€:"+m1);
        
    }
    
}
