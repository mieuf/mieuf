package pattern.chapter03.abstractFactory.demo.interOrAbstract;

public abstract class AbstractProductA {

	/**
	 * 每个产品共有的方法
	 */
	public void shareMethod() {
		System.out.println("abstrat A share method...");
	}
	
	/**
	 * 每个产品相同方法，不同实现
	 */
	public abstract void doSomething();
}
