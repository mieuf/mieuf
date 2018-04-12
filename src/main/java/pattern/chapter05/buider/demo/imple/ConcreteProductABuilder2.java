package pattern.chapter05.buider.demo.imple;

import pattern.chapter05.buider.demo.interOrAbstract.Builder;

public class ConcreteProductABuilder2 extends Builder {
	
	private ProductA productA = new ProductA();

	@Override
	public void setDetail() {
		System.out.println("concrete productA's setDetail method...");
	}

	@Override
	public ProductA buildProduct() {
		return productA;
	}

}
