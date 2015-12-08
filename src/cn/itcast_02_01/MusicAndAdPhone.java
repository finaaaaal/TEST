package cn.itcast_02_01;

public class MusicAndAdPhone extends MusicPhone {
	@Override
	public void call() {
		super.call();
		System.out.println("手机可以听广告了");
	}
}
