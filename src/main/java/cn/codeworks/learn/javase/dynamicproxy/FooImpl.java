/**
 * 
 */
package cn.codeworks.learn.javase.dynamicproxy;

/**
 * @author chad_chen
 *
 */
public class FooImpl implements Foo {

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.codeworks.learn.javase.dynamicproxy.Foo#bar(java.lang.Object)
	 */
	public Object bar(Object obj) throws BazException {
		System.out.println("bar call in FooImpl");
		return null;
	}

}
