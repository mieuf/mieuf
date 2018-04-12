package pattern.chapter06.proxy.demo.impl;

import pattern.chapter06.proxy.demo.interOrAbstract.Subject;

public class Proxy implements Subject {

	private Subject subject;
	
	public Proxy() {
		this.subject = new RealSubject();
	}
	
	public Proxy(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void request() {
		this.before();
		subject.request();
		this.after();
	}
	
	private void before() {
		System.out.println("the proxy before method");
	}
	
	private void after() {
		System.out.println("the proxy fater method");
	}

}
