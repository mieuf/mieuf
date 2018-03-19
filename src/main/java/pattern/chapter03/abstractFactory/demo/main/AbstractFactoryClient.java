package pattern.chapter03.abstractFactory.demo.main;

import pattern.chapter03.abstractFactory.demo.impl.create.Creator1;
import pattern.chapter03.abstractFactory.demo.impl.create.Creator2;
import pattern.chapter03.abstractFactory.demo.interOrAbstract.AbstractCreator;
import pattern.chapter03.abstractFactory.demo.interOrAbstract.AbstractProductA;
import pattern.chapter03.abstractFactory.demo.interOrAbstract.AbstractProductB;

public class AbstractFactoryClient {

	public static void main(String[] args) {
		AbstractCreator creator01 = new Creator1();
		AbstractCreator creator02 = new Creator2();
		AbstractProductA createProduct1A = creator01.createProductA();
		AbstractProductB createProduct1B = creator01.createProductB();
		AbstractProductA createProduct2A = creator02.createProductA();
		AbstractProductB createProduct2B = creator02.createProductB();
		
		createProduct1A.doSomething();
		createProduct1B.doSomething();
		createProduct2A.doSomething();
		createProduct2B.doSomething();
		
	}
}
