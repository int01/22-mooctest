package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pairing_HeapTest {

	// Pairing_Heap start
	@Test(timeout = 4000)
	public void test51() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("C");
		Heap_Item<String> heap_Item1 = pairing_Heap0.push(heap_Item0);
		Heap_Item<String> heap_Item2 = new Heap_Item<String>(heap_Item1);
		heap_Item1.setData("");
		pairing_Heap0.push(heap_Item0);
		heap_Item2.setLeftSon(heap_Item0);
		heap_Item0.setRightSon(heap_Item2);
		pairing_Heap0.checkPriority(heap_Item2);
		assertTrue(heap_Item1.hasRightSon());
		assertTrue(heap_Item2.hasRightSon());
	}

	@Test(timeout = 4000)
	public void test52() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = pairing_Heap0.push(heap_Item0);
		Heap_Item<String> heap_Item2 = new Heap_Item<String>(heap_Item1);
		heap_Item1.setData("v");
		Heap_Item<String> heap_Item3 = pairing_Heap0.push(heap_Item2);
		pairing_Heap0.push(heap_Item0);
		heap_Item2.setRightSon(heap_Item3);
		pairing_Heap0.pop();
		heap_Item0.setRightSon(heap_Item2);
		pairing_Heap0.checkPriority(heap_Item0);
		assertTrue(heap_Item0.hasRightSon());
		assertFalse(heap_Item0.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test53() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = pairing_Heap0.push(heap_Item0);
		Heap_Item<String> heap_Item2 = new Heap_Item<String>(heap_Item1);
		heap_Item1.setData("v");
		pairing_Heap0.push(heap_Item0);
		heap_Item2.setLeftSon(heap_Item2);
		heap_Item0.setRightSon(heap_Item2);
		pairing_Heap0.checkPriority(heap_Item0);
		assertTrue(heap_Item0.hasRightSon());
		assertFalse(heap_Item0.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test54() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = pairing_Heap0.push(heap_Item0);
		Heap_Item<String> heap_Item2 = new Heap_Item<String>(heap_Item1);
		heap_Item1.setData("v");
		pairing_Heap0.push(heap_Item2);
		pairing_Heap0.checkPriority(heap_Item2);
		assertTrue(heap_Item2.hasLeftSon());
		assertFalse(heap_Item0.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test55() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = pairing_Heap0.push(heap_Item0);
		Heap_Item<String> heap_Item2 = new Heap_Item<String>(heap_Item1);
		heap_Item1.setData("v");
		pairing_Heap0.push(heap_Item2);
		pairing_Heap0.push(heap_Item0);
		pairing_Heap0.pop();
		heap_Item0.setRightSon(heap_Item2);
		pairing_Heap0.checkPriority(heap_Item0);
		pairing_Heap0.checkPriority(heap_Item1);
		assertTrue(heap_Item1.hasRightSon());
		assertFalse(heap_Item0.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test56() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>((String) null);
		pairing_Heap0.push(heap_Item0);
		String string0 = pairing_Heap0.peek();
		assertNull(string0);
	}

	@Test(timeout = 4000)
	public void test57() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>(heap_Item0);
		String string0 = pairing_Heap0.peek();
		assertEquals("", string0);
	}

	@Test(timeout = 4000)
	public void test58() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		pairing_Heap0.push(heap_Item0);
		Heap_Item<String> heap_Item1 = pairing_Heap0.push(heap_Item0);
		pairing_Heap0.push(heap_Item1);
		Heap_Item<String> heap_Item2 = pairing_Heap0.getRoot();
		assertTrue(heap_Item2.hasRightSon());
	}

	@Test(timeout = 4000)
	public void test59() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>((String) null);
		pairing_Heap0.push(heap_Item0);
		Heap_Item<String> heap_Item1 = pairing_Heap0.getRoot();
		assertFalse(heap_Item1.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test60() throws Throwable {
		Integer integer0 = new Integer(0);
		Heap_Item<Integer> heap_Item0 = new Heap_Item<Integer>(integer0);
		Pairing_Heap<Integer> pairing_Heap0 = new Pairing_Heap<Integer>(heap_Item0);
		Heap_Item<String> heap_Item1 = new Heap_Item<String>();
		Heap_Item<Integer> heap_Item2 = pairing_Heap0.push(heap_Item0);
		heap_Item2.setRightSon(heap_Item1);
		// Undeclared exception!
		try {
			pairing_Heap0.pop();
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			assertEquals(null, e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test62() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>((Heap_Item<String>) null);
		// Undeclared exception!
		try {
			pairing_Heap0.checkPriority((Heap_Item<String>) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			assertEquals(null, e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test63() throws Throwable {
		Integer integer0 = new Integer(0);
		Heap_Item<Integer> heap_Item0 = new Heap_Item<Integer>(integer0);
		Pairing_Heap<Integer> pairing_Heap0 = new Pairing_Heap<Integer>(heap_Item0);
		Heap_Item<String> heap_Item1 = new Heap_Item<String>("");
		heap_Item0.setLeftSon(heap_Item1);
		// Undeclared exception!
		try {
			pairing_Heap0.checkPriority(heap_Item0);
			fail("Expecting exception: ClassCastException");

		} catch (ClassCastException e) {
			//
			assertEquals("java.lang.String cannot be cast to java.lang.Integer", e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test64() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = null;
		try {
			pairing_Heap0 = new Pairing_Heap<String>((Pairing_Heap<String>) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			assertEquals(null, e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test65() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = pairing_Heap0.getRoot();
		assertNull(heap_Item0);
	}

	@Test(timeout = 4000)
	public void test66() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("C");
		Heap_Item<String> heap_Item1 = new Heap_Item<String>("");
		heap_Item0.setLeftSon(heap_Item1);
		pairing_Heap0.checkPriority(heap_Item0);
		assertFalse(heap_Item0.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test67() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		Heap_Item<String> heap_Item1 = pairing_Heap0.push(heap_Item0);
		Heap_Item<String> heap_Item2 = new Heap_Item<String>("");
		heap_Item1.setData("v");
		pairing_Heap0.push(heap_Item0);
		heap_Item0.setRightSon(heap_Item2);
		pairing_Heap0.checkPriority(heap_Item0);
		assertTrue(heap_Item0.hasRightSon());
		assertFalse(heap_Item0.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test68() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = new Heap_Item<String>(heap_Item0);
		Heap_Item<String> heap_Item2 = pairing_Heap0.push(heap_Item0);
		heap_Item1.setRightSon(heap_Item0);
		heap_Item2.setData("s");
		pairing_Heap0.push(heap_Item0);
		heap_Item1.setAncestor(heap_Item0);
		pairing_Heap0.checkPriority(heap_Item1);
		assertFalse(heap_Item1.hasRightSon());
		assertTrue(heap_Item0.hasRightSon());
	}

	@Test(timeout = 4000)
	public void test69() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		pairing_Heap0.push(heap_Item0);
		Heap_Item<String> heap_Item1 = pairing_Heap0.push((Heap_Item<String>) null);
		assertNull(heap_Item1);
	}

	@Test(timeout = 4000)
	public void test70() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Pairing_Heap<String> pairing_Heap1 = new Pairing_Heap<String>(pairing_Heap0);
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = new Heap_Item<String>(heap_Item0);
		Heap_Item<String> heap_Item2 = pairing_Heap1.push(heap_Item0);
		heap_Item2.setData("s");
		pairing_Heap1.push(heap_Item0);
		heap_Item1.setAncestor(heap_Item0);
		pairing_Heap0.checkPriority(heap_Item1);
		assertNotSame(pairing_Heap0, pairing_Heap1);
	}

	@Test(timeout = 4000)
	public void test71() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = pairing_Heap0.push(heap_Item0);
		pairing_Heap0.push(heap_Item1);
		String string0 = pairing_Heap0.pop();
		assertEquals("", string0);
	}

	@Test(timeout = 4000)
	public void test72() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		String string0 = pairing_Heap0.pop();
		assertNull(string0);
	}

	@Test(timeout = 4000)
	public void test73() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		pairing_Heap0.push(heap_Item0);
		String string0 = pairing_Heap0.pop();
		assertNull(string0);
	}

	@Test(timeout = 4000)
	public void test74() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		pairing_Heap0.push(heap_Item0);
		// Undeclared exception!
		try {
			pairing_Heap0.push(heap_Item0);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			assertEquals(null, e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test75() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		// Undeclared exception!
		try {
			pairing_Heap0.peek();
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			assertEquals(null, e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test76() throws Throwable {
		Pairing_Heap<String> pairing_Heap0 = new Pairing_Heap<String>();
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = pairing_Heap0.push(heap_Item0);
		pairing_Heap0.push(heap_Item0);
		Heap_Item<String> heap_Item2 = pairing_Heap0.getRoot();
		assertSame(heap_Item2, heap_Item1);
	}

}
