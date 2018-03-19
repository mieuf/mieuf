package pattern.chapter02.factory.demo.main;

import pattern.chapter02.factory.demo.impl.ConcreteCreator;
import pattern.chapter02.factory.demo.impl.ConcreteProduct1;
import pattern.chapter02.factory.demo.impl.ConcreteProduct2;
import pattern.chapter02.factory.demo.interOrAbstract.Creator;
import pattern.chapter02.factory.demo.interOrAbstract.Product;

public class FactoryClient {

	public static void main(String[] args) throws Exception {
		Creator creator = new ConcreteCreator();
		ConcreteProduct1 createProduct1 = creator.createProduct(ConcreteProduct1.class);
		createProduct1.method2();
		ConcreteProduct2 createProduct2 = creator.createProduct(ConcreteProduct2.class);
		createProduct2.method2();
		Product product2 = creator.createProduct(Product.class);
		product2.method1();
	}
}
