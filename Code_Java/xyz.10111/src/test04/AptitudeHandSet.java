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
		System.out.println("����Ƭ");

	}

	@Override
	public void networkConn() {
		System.out.println("��������");

	}

	@Override
	public void play(String incontent) {
		System.out.println("���ŵ�Ӱ"+incontent);

	}

	@Override
	public void call() {
		System.out.println("����绰........");

	}

	@Override
	public void sendInfo() {
		System.out.println("��������.........");

	}

}
