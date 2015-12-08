package cn.itcast_01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// 我有一段代码，请测试运行时间
		for (int x = 0; x < 1000000; x++) {
			System.out.println(x);
		}
		long end = System.currentTimeMillis();
		System.out.println("共耗时：" + (end - start) + "毫秒");

		// 我还有一段代码，请测试运行事件
		// FileInputStream fis = new FileInputStream("a.avi");
		// FileOutputStream fos = new FileOutputStream("b.avi");
		// ...
		// 继续在前后加时间

		// 我还有一段代码...
		// 继续在前后加时间
	}
}
