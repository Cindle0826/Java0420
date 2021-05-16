package SourcePackage.com.myjava.ocp.patteen;

public class Bread extends Food {

	public Bread() {
		name = "麵包";
		price = 40;
	}

	@Override
	protected String getName() {
		return name;
	}

	@Override
	protected int getPrice() {
		return price;
	}
}
