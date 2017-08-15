package javassistProxy;

import java.lang.reflect.Method;

import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;

public class JavassistProxy{
	
	public Object getProxy(Class clazz) throws InstantiationException, IllegalAccessException{
		ProxyFactory proxyFactory = new ProxyFactory();
		
		proxyFactory.setSuperclass(clazz);
		
		proxyFactory.setHandler(new MethodHandler() {
			
			@Override
			public Object invoke(Object self, Method thisMethod, Method proceed, Object[] args) throws Exception {
				//dosomething
				System.out.println("开始");
				Object result=proceed.invoke(self, args);
				System.out.println("结束");
				//dosomething
				return result;
			}
		});
		
		return proxyFactory.createClass().newInstance();
	}
}