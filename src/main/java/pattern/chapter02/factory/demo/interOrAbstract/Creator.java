package pattern.chapter02.factory.demo.interOrAbstract;

public abstract class Creator {
	
	/**
	 * 抽象的创建方法
	 * @param c
	 * @return
	 * @throws Exception 
	 */
	public abstract <T extends Product> T createProduct(Class<T> c) throws Exception;

}
