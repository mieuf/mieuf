package pattern.chapter05.buider.demo.imple;

import pattern.chapter05.buider.demo.interOrAbstract.AbsProduct;
import pattern.chapter05.buider.demo.interOrAbstract.Builder;

public class ConcreteProductBBuilder2 extends Builder {

	private ProductB productB =  new ProductB();
	@Override
	public void setDetail() {
		System.out.println("concrete productB's setDetail method...");
	}

	@Override
	public AbsProduct buildProduct() {
		return this.productB;
	}

}
