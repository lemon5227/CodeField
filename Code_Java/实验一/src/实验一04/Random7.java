package สตั้าป04;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Random7 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list = new LinkedList();
        int count = 0;
        while(count <7){
            Integer a = r.nextInt(100);
            if(list.indexOf(a)==-1){
                list.add(a);
            }
            count++;
        }
        for(int num:list){
            System.out.print(num+"\t");
        }
    }
}
