package test04;

public class Test {

	public static void main(String[] args) {
		AptitudeHandSet a = new AptitudeHandSet("ŵ����","n9");
		CommonHandSet c = new CommonHandSet("ŵ����","n97");
		System.out.println("------��ͨ�ֻ�-------");
		c.call();
		c.sendInfo();
		c.play("�������졷");
		System.out.println("------�����ֻ�-------");
		a.call();
		a.sendInfo();
		a.networkConn();
		a.takePicture();
		a.play("����ȡ����ɽ��");
	}

}
