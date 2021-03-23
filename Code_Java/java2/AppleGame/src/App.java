import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int money =10;
	    Scanner scan = new Scanner(System.in);
	    while(money > 0){
	        System.out.println("猜中的物品和对应的奖励系数如下：");
	        System.out.println("苹果-------2");
	        System.out.println("木瓜-------5 ");
	        System.out.println("西瓜-------10");
	        System.out.println("香蕉-------20");
	        System.out.println("橙子-------50");
	        System.out.println("葡萄-------100");
            System.out.println("请选择你的水果，如果要退出按 Q!");
			String fruit = scan.nextLine();
            if("Q".equals(fruit)) {
				System.exit(0);
			}
            System.out.println("输入你的筹码");
            int putMoney = scan.nextInt();
            if(putMoney > money){
            	System.out.println("输入金额错误，请重新输入");
            	putMoney = scan.nextInt();
			}
            money-=putMoney;
            int  choice =  (int)(Math.random()*6+1);
            switch (choice){
				case 1:
					if("苹果".equals(fruit)){
						System.out.println("lUCK YOU!");
						System.out.println("你赢得了： "+putMoney*2);
						money+=putMoney*2;
						System.out.println("你的余额为： "+money);
					}
					else{
						System.out.println("很遗憾你选择错了");
					}
					break;
				case 2:
					if("木瓜".equals(fruit)){
						System.out.println("lUCK YOU!");
						System.out.println("你赢得了： "+putMoney*5);
						money+=putMoney*5;
						System.out.println("你的余额为： "+money);
					}
					else{
						System.out.println("很遗憾你选择错了");
					}
					break;
				case 3:
					if("西瓜".equals(fruit)){
						System.out.println("lUCK YOU!");
						System.out.println("你赢得了： "+putMoney*10);
						money+=putMoney*10;
						System.out.println("你的余额为： "+money);
					}
					else{
						System.out.println("很遗憾你选择错了");
					}
					break;
				case 4:
					if("香蕉".equals(fruit)){
						System.out.println("lUCK YOU!");
						System.out.println("你赢得了： "+putMoney*20);
						money+=putMoney*20;
						System.out.println("你的余额为： "+money);
					}
					else{
						System.out.println("很遗憾你选择错了");
					}
					break;
				case 5:
					if("橙子".equals(fruit)){
						System.out.println("lUCK YOU!");
						System.out.println("你赢得了： "+putMoney*50);
						money+=putMoney*50;
						System.out.println("你的余额为： "+money);
					}
					else{
						System.out.println("很遗憾你选择错了");
					}
					break;
				case 6:
					if("葡萄".equals(fruit)){
						System.out.println("lUCK YOU!");
						System.out.println("你赢得了： "+putMoney*100);
						money+=putMoney*100;
						System.out.println("你的余额为： "+money);
					}
					else{
						System.out.println("很遗憾你选择错了");
					}
					break;
			}
        }
    }
}
