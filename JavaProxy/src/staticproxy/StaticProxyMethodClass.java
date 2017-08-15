package staticproxy;

public class StaticProxyMethodClass implements IProxyMethodClass {

	private PrimaryMethodClass primaryMethod;
	
	public StaticProxyMethodClass(PrimaryMethodClass primaryMethod) {
		super();
		this.primaryMethod = primaryMethod;
	}

	@Override
	public void save() {
		before();
		primaryMethod.save();
		end();
	}
	
	public void before(){
		System.out.println("before");
	}
	
	public void end(){
		System.out.println("end");
	}
	
}
