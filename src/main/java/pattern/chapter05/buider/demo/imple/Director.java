package pattern.chapter05.buider.demo.imple;

import pattern.chapter03.abstractFactory.demo.impl.product.ProductB2;
import pattern.chapter05.buider.demo.interOrAbstract.Builder;

public class Director {

	private Builder productAbuilder1 = new ConcreteProductABuilder1();
	private Builder productAbuilder2 = new ConcreteProductABuilder2();
	private Builder productBbuilder1 = new ConcreteProductBBuilder1();
	private Builder productBbuilder2 = new ConcreteProductBBuilder2();
	
	public ProductA getProductA1() {
		productAbuilder1.setDetail();
		return (ProductA) productAbuilder1.buildProduct();
	}
	
	public ProductA getProductA2() {
		productAbuilder2.setDetail();
		return (ProductA) productAbuilder2.buildProduct();
	}
	
	public ProductB getProductB1() {
		productBbuilder1.setDetail();
		return (ProductB) productBbuilder1.buildProduct();
	}
	
	public ProductB getProductB2() {
		productBbuilder2.setDetail();
		return (ProductB) productBbuilder2.buildProduct();
	}
	
	public static void main(String[] args) {
		Director director = new Director();
		ProductA productA1 = director.getProductA1();
		productA1.doSomething();
		ProductA productA2 = director.getProductA2();
		productA2.doSomething();
		ProductB productB1 = director.getProductB1();
		productB1.doSomething();
		ProductB productB2 = director.getProductB2();
		productB2.doSomething();
	}
}
