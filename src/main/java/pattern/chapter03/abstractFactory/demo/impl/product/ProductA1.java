package pattern.chapter03.abstractFactory.demo.impl.product;

import pattern.chapter03.abstractFactory.demo.interOrAbstract.AbstractProductA;

public class ProductA1 extends AbstractProductA {

	@Override
	public void doSomething() {
		System.out.println("productA1 doSomething method...");
	}

}