package cn.itcast_01_01;

/*
 * ģ�淽�����ģʽ
 */
public abstract class GetTime {
	// public void code() {
	// long start = System.currentTimeMillis();
	// // ����һ�δ��룬���������ʱ��
	// for (int x = 0; x < 1000000; x++) {
	// System.out.println(x);
	// }
	// long end = System.currentTimeMillis();
	// System.out.println("����ʱ��" + (end - start) + "����");
	// }

	// �Ľ��淽��
	public long getTime() {
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		return end - start;
	}

	public abstract void code();
}
