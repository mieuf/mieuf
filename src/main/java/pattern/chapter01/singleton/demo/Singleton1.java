package pattern.chapter01.singleton.demo;
/**
 * 懒汉模式(多线程安全)
 * @author mieuf
 *
 */
public class Singleton1 {

	private static Singleton1 singleton1 = null;
	
	private Singleton1() {	}
	
	public static Singleton1 getSingleton() {
		// 如果第一个线程获取到了单例的实例对象， 后面的线程再获取实例的时候不需要进入同步代码块中了 
		if(singleton1 == null) {
			//类锁保证同步
			synchronized (Singleton1.class) {
				if(singleton1 == null) {
					singleton1 = new Singleton1();
				}
			}
		}
		return singleton1;
	}
}
