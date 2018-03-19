package pattern.chapter03.abstractFactory.demo.impl.create;

import pattern.chapter03.abstractFactory.demo.impl.product.ProductA1;
import pattern.chapter03.abstractFactory.demo.impl.product.ProductB1;
import pattern.chapter03.abstractFactory.demo.interOrAbstract.AbstractCreator;
import pattern.chapter03.abstractFactory.demo.interOrAbstract.AbstractProductA;
import pattern.chapter03.abstractFactory.demo.interOrAbstract.AbstractProductB;

public class Creator1 extends AbstractCreator{

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

	
}
