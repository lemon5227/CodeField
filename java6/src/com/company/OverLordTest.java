package com.company;

public class OverLordTest {
    public static void main(String[] args) {
        OverLordExer o1 =new OverLordExer();
        o1.mOl(5);
        o1.mOl("asdfa");
        o1.mOl(5,7);
       final int num=100;
    }
}
class OverLordExer{
    public void mOl(int i){
        System.out.println(i*i);
    }
    public void mOl(int i,int j){
        System.out.println(i*j);
    }
    public void mOl(String s){
        System.out.println(s);
    }
}
