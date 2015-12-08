package cn.itcast_02_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p = new PhoneImpl();
		p.call();
		System.out.println("-------------");

		PhoneDecorate pd = new MusicPhoneDecorate(p);
		pd.call();
		System.out.println("-------------");

		pd = new AdPhoneDecorate(p);
		pd.call();
		System.out.println("-------------");

		pd = new AdPhoneDecorate(new MusicPhoneDecorate(p));
		pd.call();

		// 我讲解装饰模式是为了让大家回顾IO流
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
		// System.out));
		// Scanner sc = new Scanner(System.in);
		// PrintWriter pw = new PrintWriter("pw.txt");
	}
}
