package pattern.chapter01.singleton.demo;
/**
 * 饿汉模式
 * @author mieuf
 *
 */
public class Singleton {

	private static final Singleton singletion = new Singleton();
	
	/**
	 * 私有构造方法
	 */
	private Singleton() {}
	
	/**
	 * 获取返回值
	 * @return
	 */
	public static Singleton getSingleton() {
		return singletion;
	}
}