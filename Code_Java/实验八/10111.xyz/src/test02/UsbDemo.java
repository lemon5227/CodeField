package test02;

public class UsbDemo {

	public static void main(String[] args) {
		UDisk u1 = new UDisk();
		UsbFan u3 = new UsbFan();
		UsbMouse u2 = new UsbMouse();
		u1.service();
		u2.service();
		u3.service();
	}

}
