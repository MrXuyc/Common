package javassistProxy.factory;

import java.lang.reflect.Method;

import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;

public class JavassistProxyFactory<T> {
	
	private T target;

	public T getTarget() {
		return target;
	}

	public void setTarget(T target) {
		this.target = target;
	}
	
	
	public T getProxy() throws InstantiationException, IllegalAccessException{
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setSuperclass(target.getClass());
		proxyFactory.setHandler(new MethodHandler() {
			
			@Override
			public Object invoke(Object self, Method thisMethod, Method proceed, Object[] args) throws Exception {
				System.out.println(self.getClass());
				System.out.println(thisMethod.getName());
				System.out.println(proceed.getName());
                Object result = proceed.invoke(self, args);
                System.out.println("做完了");
                //下面的代码效果与上面的相同
                //不过需要传入一个目标对象
                //Object result = thisMethod.invoke(target,args);
				return result;
			}
		});
		return (T) proxyFactory.createClass().newInstance();
	}
}


