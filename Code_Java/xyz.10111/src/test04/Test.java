package test04;

public class Test {

	public static void main(String[] args) {
		AptitudeHandSet a = new AptitudeHandSet("诺基亚","n9");
		CommonHandSet c = new CommonHandSet("诺基亚","n97");
		System.out.println("------普通手机-------");
		c.call();
		c.sendInfo();
		c.play("《东方红》");
		System.out.println("------智能手机-------");
		a.call();
		a.sendInfo();
		a.networkConn();
		a.takePicture();
		a.play("《智取威虎山》");
	}

}
