package staticproxy;

public class AppExe {
	public static void main(String[] args) {
		PrimaryMethodClass primaryMethod=new PrimaryMethodClass();
		IProxyMethodClass staticProxyMethod=new StaticProxyMethodClass(primaryMethod);
		//如果不用多态的话，可以代理类不实现被代理类的接口
		staticProxyMethod.save();
	}
}
