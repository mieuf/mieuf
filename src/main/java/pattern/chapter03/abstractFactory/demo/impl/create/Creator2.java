package pattern.chapter03.abstractFactory.demo.impl.create;

import pattern.chapter03.abstractFactory.demo.impl.product.ProductA2;
import pattern.chapter03.abstractFactory.demo.impl.product.ProductB2;
import pattern.chapter03.abstractFactory.demo.interOrAbstract.AbstractCreator;
import pattern.chapter03.abstractFactory.demo.interOrAbstract.AbstractProductA;
import pattern.chapter03.abstractFactory.demo.interOrAbstract.AbstractProductB;

public class Creator2 extends AbstractCreator{

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

	
}
