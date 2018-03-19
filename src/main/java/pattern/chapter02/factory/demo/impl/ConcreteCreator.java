package pattern.chapter02.factory.demo.impl;

import java.lang.reflect.Modifier;

import pattern.chapter02.factory.demo.interOrAbstract.Creator;
import pattern.chapter02.factory.demo.interOrAbstract.Product;

public class ConcreteCreator extends Creator {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Product> T createProduct(Class<T> c) throws Exception {
		Product product = null;
		if(c != null) {
			boolean abs = Modifier.isAbstract(c.getModifiers());
			if(!abs) {
				try {
					product = (Product)Class.forName(c.getName()).newInstance();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else {
				throw new Exception("the createProduct method's parameter is abstract class object...");
			}
		}
		return (T) product;
	}

}
