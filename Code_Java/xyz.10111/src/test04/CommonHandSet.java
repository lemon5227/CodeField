package test04;

public class CommonHandSet extends HandSet implements Play {

	public CommonHandSet() {
		
	}
	public CommonHandSet(String brand,String species) {
		super.setBrand(brand);
		super.setSpecies(species);
	}
	@Override
	public void play(String incontent) {
		System.out.println("播放歌曲"+incontent);

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
