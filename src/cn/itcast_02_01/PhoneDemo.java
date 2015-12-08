package cn.itcast_02_01;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.call();
		System.out.println("--------------");

		MusicPhone mp = new MusicPhone();
		mp.call();
		System.out.println("--------------");

		AdPhone ap = new AdPhone();
		ap.call();
		System.out.println("--------------");

		MusicAndAdPhone maap = new MusicAndAdPhone();
		maap.call();
	}
}
