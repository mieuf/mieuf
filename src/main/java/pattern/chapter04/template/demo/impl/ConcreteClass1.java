package pattern.chapter04.template.demo.impl;

import pattern.chapter04.template.demo.interOrAbstract.AbstractClass;

public class ConcreteClass1 extends AbstractClass {

	@Override
	protected void doSomething() {
		System.out.println("class 1 doSomething method...");
	}

	@Override
	protected void doAnything() {
		System.out.println("class 1 doAnything method...");
	}

	@Override
	protected boolean flagMethod() {
		return true;
	}

}
