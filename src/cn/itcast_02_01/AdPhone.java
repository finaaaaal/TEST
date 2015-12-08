package cn.itcast_02_01;

public class AdPhone extends Phone {
	@Override
	public void call() {
		super.call();
		System.out.println("手机可以听广告了");
	}
}
