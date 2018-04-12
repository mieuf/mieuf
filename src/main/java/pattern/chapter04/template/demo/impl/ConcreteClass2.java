package pattern.chapter04.template.demo.impl;

import pattern.chapter04.template.demo.interOrAbstract.AbstractClass;

public class ConcreteClass2 extends AbstractClass {

	@Override
	protected void doSomething() {
		System.out.println("class 2 doSomething method...");
	}

	@Override
	protected void doAnything() {
		System.out.println("class 2 doAnythind method...");
	}

	@Override
	protected boolean flagMethod() {
		return false;
	}
	

}
