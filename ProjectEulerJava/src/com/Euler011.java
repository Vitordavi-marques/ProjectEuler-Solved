
package com;

public class Euler011 {
    
    static final String s = "0802229738150040007504050778521250779108" +
                "4949994017811857608717409843694804566200" +
                "8149317355791429937140675388300349133665" +
                "5270952304601142692468560132567137023691" +
                "2231167151676389419236542240402866331380" +
                "2447326099034502447533537836842035171250" +
                "3298812864236710263840675954706618386470" +
                "6726206802621220956394396308409166499421" +
                "2455580566739926971778789683148834896372" +
                "2136230975007644204535140061339734313395" +
                "7817532822753167159403800462161409535692" +
                "1639054296353147555888240017542436298557" +
                "8656004835718907054444374460215851541758" +
                "1980816805944769287392138652177704895540" +
                "0452088397359916079757321626267933279866" +
                "8836688757622072034633674655123263935369" +
                "0442167338253911249472180846293240627636" +
                "2069364172302388346299698267598574043616" +
                "2073352978319001743149714886811623570554" +
                "0170547183515469169233486143520189196748 ";
    
    static int[][] dMatrix = new int[20][20];
    static int bM = 1;
    
    public static void main(String[] args) {
        sepIntoArray();
        upDir();
        downDir();
        leftDir();
        rightDir();
        rDiaDir();
        lDiaDir();
    }
    
    protected static void verticalDir() {
        
    }
    
    protected static void upDir() {
        for (int a=4;a<=20;a++) {
            for (int b=1;b<=20;b++) {
                multNumbers(getD(a,b), getD(a-1,b), getD(a-2,b), getD(a-3,b));
                //System.out.print("(" + a + "," + b+") ");
                //System.out.println("");
            }
        }
    }
    
    protected static void downDir() {
        for (int a=1;a<=17;a++) {
            for (int b=1;b<=20;b++) {
                multNumbers(getD(a,b), getD(a+1,b), getD(a+2,b), getD(a+3,b));
            }
        }
    }
    
    protected static void rightDir() {
        for (int a=1;a<=20;a++) {
            for (int b=1;b<=17;b++) {
                multNumbers(getD(a,b), getD(a,b+1), getD(a,b+2), getD(a,b+3));
            }
        }
    }
    
    protected static void leftDir() {
        for (int a=1;a<=20;a++) {
            for (int b=4;b<=20;b++) {
                multNumbers(getD(a,b), getD(a,b-1), getD(a,b-2), getD(a,b-3));
            }
        }
    }
    
    protected static void rDiaDir() {
        for (int a=1;a<=17;a++) {
            for (int b=1;b<=17;b++) {
                multNumbers(getD(a,b), getD(a+1,b+1), getD(a+2,b+2), getD(a+3,b+3));
            }
        }
    }
    
    protected static void lDiaDir() {
        for (int a=1;a<=17;a++) {
            for (int b=4;b<=20;b++) {
                multNumbers(getD(a,b), getD(a+1,b-1), getD(a+2,b-2), getD(a+3,b-3));
            }
        }
    }
    
    protected static void multNumbers(int w, int x, int y, int z) {
        int o = (w*x*y*z);
        
        if (o > bM) {
            bM = o;
            System.out.println(bM + " = " + w + " * " + x + " * " + y + " * " + z);
        }
    }
    
    protected static void sepIntoArray() {
        for (int a=0;a<=19;a++) {
            for (int b=0;b<=19;b++) {
                setD(a+1,b+1, Integer.parseInt( s.substring((a*20+b)*2, ((a*20+b)*2)+2 )));
                //System.out.println(getD(a+1,b+1));
            }
        }
    }

    public static int getD(int i, int i2) {
        return dMatrix[i-1][i2-1];
    }

    public static void setD(int i, int i2, int d) {
        dMatrix[i-1][i2-1] = d;
    }
}
