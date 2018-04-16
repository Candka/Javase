package com.itcast.filedemo;

import java.io.File;
import java.io.IOException;

/*
 *  java.io.File
 *    将操作系统中的,文件,目录(文件夹),路径,封装成File对象
 *    提供方法,操作系统中的内容
 *    File与系统无关的类
 *    文件 file
 *    目录 directory
 *    路径 path
 */

public class FileDemo {
	private static File file;

	public static void main(String[] args) throws IOException {
		getName();
	}

	/*
	 * File类静态成员变量
	 */
	public static void separator() {
		// 与系统有关的路径分隔符
		String pathSeparator = File.pathSeparator;
		System.out.println(pathSeparator);// 是一个分号,目录的分割 Linux :

		// 与系统有关的默认名称分隔符
		String separator = File.separator;
		System.out.println(separator);// 向右 \ 目录名称分割 Linux /
	}

	/*
	 * File类的构造方法 三种重载形式
	 */
	public static void constructor1() {
		// File(String pathname)
		// 传递路径名: 可以写到文件夹,可以写到一个文件 H:\\new H:\\new\\1.exe
		// 将路径封装File类型对象
		file = new File("H:\\new");
		System.out.println(file);
		file = new File("H:\\new\\1.exe");
		System.out.println(file);
	}

	public static void constructor2() {
		// File(String parent,String child)
		// 传递路径,传递字符串父路径,字符串子路径
		// 好处: 单独操作父路径和子路径
		file = new File("H:", "new");
		System.out.println(file);
	}

	public static void constructor3() {
		// File(File parent,String child)
		// 传递路径,传递File类型父路径,字符串子路径
		// 好处:父路径是File类型,父路径可以直接调用File类方法
		File parent = new File("H:");
		file = new File(parent, "new");
		System.out.println(file);
	}

	/*
	 * File类的创建和删除功能 文件或者是目录
	 */
	public static void createFile() throws IOException {
		// File创建文件的功能
		// boolean createNewFile()
		// 创建的文件路径和文件名,在File构造方法中给出 文件已经存在了,不在创建
		file = new File("H:\\a.txt");
		boolean createNewFile = file.createNewFile();
		 System.out.println(createNewFile);
	}

	public static void createDirectory() {
		// File创建文件夹功能
		// boolean mkdir() 创建单层文件夹 创建的路径也在File构造方法中给出
		// boolean mkdirs() 创建多层文件夹
		// 文件夹已经存在了,不在创建
		file = new File("H:\\new\\1");
		boolean mkdir = file.mkdir();
		System.out.println(mkdir);
		file = new File("H:\\new\\2\\3\\4\\5");
		boolean mkdirs = file.mkdirs();
		System.out.println(mkdirs);
	}

	public static void deleteFile() {
		// File类的删除功能
		// boolean delete()
		// 删除的文件或者是文件夹,在File构造方法中给出 删除成功返回true,删除失败返回false
		// 删除方法,不走回收站,直接从硬盘中删除 删除有风险,运行需谨慎
		file = new File("H:\\new\\新建文本文档.txt");
		boolean delete = file.delete();
		System.out.println(delete);
	}

	/*
	 * File类的获取功能
	 */
	public static void getName() {
		// File类的获取功能
		// String getName()返回由此抽象路径名表示的文件或目录的名称。获取路径中的最后部分的名字
		file = new File("H:\\new\\新建文本文档.txt");
		String name = file.getName();
		System.out.println(name);
		// String getPath()将此抽象路径名转换为一个路径名字符串。
		String path = file.getPath();
		System.out.println(path);
	}

}
