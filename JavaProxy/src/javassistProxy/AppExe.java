package javassistProxy;

import javassistProxy.factory.JavassistProxyFactory;

public class AppExe {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		JavassistProxyFactory<UserDao> javassistProxyFactory = new JavassistProxyFactory<UserDao>();
		UserDao target=new UserDao();
		javassistProxyFactory.setTarget(target);
		UserDao proxy = javassistProxyFactory.getProxy();
		proxy.save();
		
		//--------------------------------------
		JavassistProxy javassistProxy = new JavassistProxy();
		UserDao proxy2 =  (UserDao) javassistProxy.getProxy(UserDao.class);
		proxy2.save();
		
	}
}
