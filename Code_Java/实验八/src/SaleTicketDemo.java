public class SaleTicketDemo {
	public static void main(String[] args) {
		SaleTicket st = new SaleTicket();
		for (int i = 1; i <=5;i++){
			String str = "售票点"+i;
			new Thread(st,str).start();
		}

	}
}
