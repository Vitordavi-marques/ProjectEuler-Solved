
package com;

public class Euler001 {
    
    public static void main(String[] args) {
        
        int intervalo = 1000;
        int sum = 0;
        
        for (int contA=3;contA<intervalo;contA=contA+3) {
            sum = sum + contA;
        }
        
        for (int contB=5;contB<intervalo;contB=contB+5) {
            if (contB % 15 != 0) {
                sum = sum + contB;
            }
        }
        
        System.out.println(sum);
    }
}
