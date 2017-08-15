package cglibproxy;

import java.io.IOException;

public class AppExe {
	public static void main(String[] args) {
		//目标对象
		UserDao target = new UserDao();
		//代理对象
		UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();
		//执行代理对象的方法
		proxy.save();
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}