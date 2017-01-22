package cn.codeworks.learn.javase.dynamicproxy;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDebugProxy {

	@Test
	public void testNewInstance() throws BazException {
		Foo foo = (Foo) DebugProxy.newInstance(new FooImpl());
		foo.bar(null);
	}

	@Test
	public void testInvoke() {
		fail("Not yet implemented");
	}

}
