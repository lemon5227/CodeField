package test02;

public class UsbMouse implements UsbInterface {

	@Override
	public void service() {
		System.out.println("链接USB接口，开始操作鼠标！");

	}

}
