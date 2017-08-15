package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyMethodClass {
	
	
	public DynamicProxyMethodClass(Object target) {
		super();
		this.target = target;
	}

	private Object target;
	
	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    	before();
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        end();
                        return returnValue;
                    }
                }
        );
    }
	
	public void before(){
		System.out.println("before");
	}
	
	public void end(){
		System.out.println("end");
	}
}
