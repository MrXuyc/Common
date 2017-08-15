package dynamicproxy;


public class PrimaryMethodClass2 implements IProxyMethodClass2 {

	@Override
	public void delete() {
		System.out.println("PrimaryMethodClass2 delete start");
	}

}
