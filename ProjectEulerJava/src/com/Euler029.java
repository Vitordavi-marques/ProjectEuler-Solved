
package com;

public class Euler029 {
    
    static int aP=2;
    static int aN=2;
    static int po;
    static int l = 100; //ULTIMO NÚMERO DO INTERVALO
    static int ty = l-1; //INTERVALO
    static int k;
    static boolean[] mN = new boolean[l+1];
    
    public static void main(String[] args) {
        
        for (int zz=2;zz<=l;zz++) {
            //System.out.println(zz+":");
            if (findPrimeBase(zz)!=0) {
                createTable(zz,po);
                //System.out.println("");
            }
        }
        
        System.out.println("Resultado: "+((ty*ty)-k));
    }
    
    protected static void createTable(int p, int bP) {
        int[] n = new int[(po*ty)+1];
        boolean[] nB = new boolean[(po*ty)+1];
        
        for (int c=1;c<=(po*ty);c++) {
            int rr = ((int) Math.ceil(c/ty)); 
            
            if (c%ty==0) {
                n[c] = (rr*l);
            } else {
                n[c] = (((rr)+1) * ((c%ty)+1));
            }
            
            nB[c] = true;
            //System.out.println("c=" + c+". n[c]="+n[c]);
        }
        
        customSieve(n,nB);
    }
    
    protected static int findPrimeBase(int n) {
        int p=1;
        
        if (mN[n]==false) {
            while ((int)Math.pow(n, p+1) <= l) {
                p++;
                mN[(int)Math.pow(n, p)] = true;
            }
        }
        
        p = (p==1) ? 0:p;
        if (p!=0) {
            mN[n] = true;
        }
        po=p;
        //System.out.println("n="+n+". po="+po);
        return p;
    }
    
    //
    protected static void customSieve(int[] j, boolean[] l) {
        for (int a=1;a<(po*ty);a++) {
            for (int b=a+1;b<=(po*ty);b++) {
                
                if ((l[b]) && (l[a])) {
                    if (j[a]==j[b]) {
                        l[b]=false;
                        k++;
                        //System.out.println("j["+(int)Math.ceil(a/ty)+":"+(a%ty)+"] = "+j[a]+". j["+((int)Math.ceil(b/ty))+":"+(b%ty)+"] ="+j[b]);
                    }
                } 
            }
        }
    }
    
    protected static void nextPrime() {
        aP++;
        while (!checkIfPrime(aP)) {
            aP++;
        }
    }
    
    protected static boolean checkIfPrime(int p) {
        boolean y = true;
        boolean yy = true;
        if ((((p%2==0)&&(p>2)) || (((p>5)&&(p%5==0)) && (p%2==1))) || (p==1)) {
            y = false;
        } else {
            for (int div=2;div<=Math.ceil((int)Math.sqrt(p));div++) {
                if (yy) {
                    if (p%div==0) {
                        yy=false;
                        y=false;
                    }
                }
            }
        }
        return y;
    }
}
