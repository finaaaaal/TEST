package cn.itcast_01_01;

/*
 * 模版方法设计模式
 */
public abstract class GetTime {
	// public void code() {
	// long start = System.currentTimeMillis();
	// // 我有一段代码，请测试运行时间
	// for (int x = 0; x < 1000000; x++) {
	// System.out.println(x);
	// }
	// long end = System.currentTimeMillis();
	// System.out.println("共耗时：" + (end - start) + "毫秒");
	// }

	// 改进版方法
	public long getTime() {
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		return end - start;
	}

	public abstract void code();
}
