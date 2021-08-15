package com.company;

/**
 * @author ãÆÎÄ²©
 */
public class ReTest {
    public static void main(String[] args) {
        ReTest r1 = new ReTest();
        int sum1=r1.getsum(10);
        System.out.println(sum1);
    }
    public int getsum(int n){
        if(n==1){
            return 1;
        }else {
            return n * getsum(n-1);
        }
    }
}
