package cn.itcast_01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// ����һ�δ��룬���������ʱ��
		for (int x = 0; x < 1000000; x++) {
			System.out.println(x);
		}
		long end = System.currentTimeMillis();
		System.out.println("����ʱ��" + (end - start) + "����");

		// �һ���һ�δ��룬����������¼�
		// FileInputStream fis = new FileInputStream("a.avi");
		// FileOutputStream fos = new FileOutputStream("b.avi");
		// ...
		// ������ǰ���ʱ��

		// �һ���һ�δ���...
		// ������ǰ���ʱ��
	}
}
