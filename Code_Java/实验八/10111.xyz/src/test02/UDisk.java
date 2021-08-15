package test02;

public class UDisk implements UsbInterface {

	@Override
	public void service() {
		System.out.println("链接USB接口，开始传输数据！");

	}


}
