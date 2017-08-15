package dynamicproxy;

import staticproxy.IProxyMethodClass;

public class AppExe {
	public static void main(String[] args) throws Exception {
		Thread.sleep(30000);
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		//动态代理1
		IProxyMethodClass primaryMethodClass=new PrimaryMethodClass();
		System.out.println("原类名"+primaryMethodClass.getClass());
		IProxyMethodClass proxyMethodClass=(IProxyMethodClass) new DynamicProxyMethodClass(primaryMethodClass).getProxyInstance();
		System.out.println("代理后"+proxyMethodClass.getClass());
		proxyMethodClass.save();
		//动态代理2
		IProxyMethodClass2 primaryMethodClass2=new PrimaryMethodClass2();
		System.out.println("原类名"+primaryMethodClass2.getClass());
		IProxyMethodClass2 proxyMethodClass2=(IProxyMethodClass2) new DynamicProxyMethodSubClass(primaryMethodClass2).getProxyInstance();
		System.out.println("代理后"+proxyMethodClass2.getClass());
		proxyMethodClass2.delete();
		System.in.read();
	}
	
}
