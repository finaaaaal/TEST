package cn.itcast_02_02;

public abstract class PhoneDecorate implements Phone {

	private Phone p;

	public PhoneDecorate(Phone p) { // new PhoneImp(); new PhoneImpl2();
		this.p = p;
	}

	@Override
	public void call() {
		this.p.call();
	}

}
