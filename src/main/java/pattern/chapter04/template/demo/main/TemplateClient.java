package pattern.chapter04.template.demo.main;

import pattern.chapter04.template.demo.impl.ConcreteClass1;
import pattern.chapter04.template.demo.impl.ConcreteClass2;
import pattern.chapter04.template.demo.interOrAbstract.AbstractClass;

public class TemplateClient {

	public static void main(String[] args) {
		AbstractClass class1 = new ConcreteClass1();
		AbstractClass class2 = new ConcreteClass2();
		
		class1.templateMethod();
		class2.templateMethod();
	}
}
