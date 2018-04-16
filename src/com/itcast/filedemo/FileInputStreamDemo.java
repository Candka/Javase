package com.itcast.filedemo;

import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		int b = 0;
		FileInputStream in = null;
		try {
			in = new FileInputStream("F:\\Workspaces\\j2se\\IODemo\\src\\demo1\\FileInputStreamDemo.java");
		} catch (FileNotFoundException e) {
			System.out.println("��ȡ�ļ�����");
			System.exit(-1);
		}

		try {
			long num = 0;
			while ((b = in.read()) != -1) {
				System.out.print((char) b);
				num++;
			}
			in.close();
			System.out.println();
			System.out.println("����ȡ" + num+"���ֽ�");
		} catch (IOException e1) {
			System.out.println("��ȡ�ļ�����");
			System.exit(-1);
		}

	}

}
