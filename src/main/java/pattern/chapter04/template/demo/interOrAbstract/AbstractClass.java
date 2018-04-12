package pattern.chapter04.template.demo.interOrAbstract;

public abstract class AbstractClass {

	protected abstract void doSomething();
	
	protected abstract void doAnything();
	
	protected abstract boolean flagMethod();
	
	public void templateMethod() {
		System.out.println("abstract class templateMethod...");
		if(this.flagMethod()) {
			this.doSomething();
		}
		this.doAnything();
	}
}
