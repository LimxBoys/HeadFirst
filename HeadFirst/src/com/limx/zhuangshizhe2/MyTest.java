package com.limx.zhuangshizhe2;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyTest {
	public static void main(String[] args) {
		TheGreatestSage sage = new Monkey();
		TheGreatestSage bird = new Bird(sage);
		TheGreatestSage fish = new Fish(bird);
		fish.move();
		System.out
				.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new BufferedInputStream(
					new FileInputStream("D://Test.txt")));
			byte[] bs = new byte[dis.available()];
			System.out.println(bs.length);
			dis.read(bs);
			String content = new String(bs);
			System.out.println(content);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out
				.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		try {
			BufferedInputStream bufferedInputStream=new BufferedInputStream(
					new FileInputStream("D://Test.txt"));
			byte[] bs = new byte[bufferedInputStream.available()];
			System.out.println(bs.length);
			bufferedInputStream.read(bs);
			String content = new String(bs);
			System.out.println(content);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out
		.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		try {
			FileInputStream fileInputStream=new FileInputStream("D://Test.txt");
			byte[] bs = new byte[fileInputStream.available()];
			System.out.println(fileInputStream.available());
			fileInputStream.read(bs);
			String content = new String(bs);
			System.out.println(content);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
