package dynamicproxy;

public class DynamicProxyMethodSubClass extends DynamicProxyMethodClass {

	public DynamicProxyMethodSubClass(Object target) {
		super(target);
	}

	@Override
	public void before() {
		System.out.println("sub before");
	}

	@Override
	public void end() {
		System.out.println("sub end");
	}
	
	
}
