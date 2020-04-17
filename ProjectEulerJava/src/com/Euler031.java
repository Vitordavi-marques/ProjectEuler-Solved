
package com;

public class Euler031 {
    
    public static void main(String[] args) {
        System.out.println(change(200,new int[]{1,2,5,10,20,50,100,200}));
    }
    
    protected static int change(int amount, int[] coins) {
        int[] combinations = new int[amount+1];
        
        combinations[0] = 1;
        
        for (int coin : coins) {
            for (int i = 1; i < combinations.length;i++) {
                if (i>=coin) {
                    combinations[i] += combinations[i-coin];
                }   
            }
        }
        
        return combinations[amount];
    }
}
