package cn.itcast_02_02;

public class MusicPhoneDecorate extends PhoneDecorate {

	public MusicPhoneDecorate(Phone p) {
		super(p);
	}

	@Override
	public void call() {
		System.out.println("�ֻ�����������");
		super.call();
	}

}
