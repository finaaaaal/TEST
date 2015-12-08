package cn.itcast_02_01;

public class MusicPhone extends Phone {
	@Override
	public void call() {
		System.out.println("手机可以听彩铃");
		super.call();
	}
}
