package dynamicproxy;

import staticproxy.IProxyMethodClass;

public class PrimaryMethodClass implements IProxyMethodClass {

	@Override
	public void save() {
		System.out.println("PrimaryMethodClass save start");
	}

}
