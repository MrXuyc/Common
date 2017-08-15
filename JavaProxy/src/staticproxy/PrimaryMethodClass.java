package staticproxy;

public class PrimaryMethodClass implements IProxyMethodClass {

	@Override
	public void save() {
		System.out.println("PrimaryMethod save start");
	}

}
