package cn.codeworks.learn.javase.dynamicproxy;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class TestDelegator {

	@SuppressWarnings("rawtypes")
	@Test
	public void testInvoke() throws BazException {
		Class[] proxyInterfaces = new Class[] { Foo.class };
		Foo foo = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(), proxyInterfaces,
				new Delegator(proxyInterfaces, new Object[] { new FooImpl() }));
		foo.bar(null);
	}

}
