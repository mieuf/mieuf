package pattern.chapter06.proxy.demo.impl;

import pattern.chapter06.proxy.demo.interOrAbstract.Subject;

public class RealSubject implements Subject {

	
	@Override
	public void request() {
		System.out.println("the realSubject...");
	}
	

}
