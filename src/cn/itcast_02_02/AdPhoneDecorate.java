package cn.itcast_02_02;

public class AdPhoneDecorate extends PhoneDecorate {

	public AdPhoneDecorate(Phone p) {
		super(p);
	}

	@Override
	public void call() {
		super.call();
		System.out.println("手机可以听广告了");
	}
}
