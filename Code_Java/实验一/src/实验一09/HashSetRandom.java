package สตั้าป09;

import java.util.HashSet;
import java.util.Random;

public class HashSetRandom {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> hashset = new HashSet<>();
        while (hashset.size()<7){
            hashset.add(r.nextInt(100));
        }

        for(int num:hashset){
            System.out.print(num+"\t");
        }
    }
}
