package pattern.chapter05.buider.demo.imple;

import pattern.chapter05.buider.demo.interOrAbstract.AbsProduct;

public class ProductB extends AbsProduct {
	
	public void doSomething() {
		System.out.println("productB's doSomething method...");
	}

	@Override
	public void doSomething1() {
		System.out.println("productB's doSomething1 method...");
	}

	@Override
	public void doSomething2() {
		System.out.println("productB's doSomething2 method...");
	}

}
