package pattern.chapter02.factory.demo.impl;

import pattern.chapter02.factory.demo.interOrAbstract.Product;

public class ConcreteProduct1 extends Product {

	@Override
	public void method2() {
		System.out.println("ConcreteProduct1's method2");
	}
}
