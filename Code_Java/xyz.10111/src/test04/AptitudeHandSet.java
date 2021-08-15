package test04;

public class AptitudeHandSet extends HandSet implements Play, NetWork, TakePictures {

	public AptitudeHandSet() {
		
	}
	public AptitudeHandSet(String brand,String species) {
		super.setBrand(brand);
		super.setSpecies(species);
	}
	@Override
	public void takePicture() {
		System.out.println("拍照片");

	}

	@Override
	public void networkConn() {
		System.out.println("连接网络");

	}

	@Override
	public void play(String incontent) {
		System.out.println("播放电影"+incontent);

	}

	@Override
	public void call() {
		System.out.println("拨打电话........");

	}

	@Override
	public void sendInfo() {
		System.out.println("发送文字.........");

	}

}
