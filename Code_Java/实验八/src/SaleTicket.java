public class SaleTicket implements Runnable{
	private int ticket =1;
	@Override
	public void run() {
		while (true) {
			synchronized (this){
				if(ticket <= 20){
					try{
						Thread.sleep(100);
					}catch(InterruptedException e){
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread().getName() + " 正在销售第"+ticket+"张票");
					ticket++;
				}else {
					break;
				}
			}
		}
	}
}
