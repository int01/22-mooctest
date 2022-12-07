package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Heap_ItemTest {

	@Test
	public void test() {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>(",");
		Heap_Item<String> heap_Item1 = new Heap_Item<String>(",");
		heap_Item1.setLeftSon(heap_Item0);
		heap_Item0.setLeftSon(heap_Item1);
		heap_Item0.setRightSon(heap_Item1);
		heap_Item1.replaceChild("$", heap_Item0);
		heap_Item0.getSonByData(",");
		heap_Item0.getSonByData("");
		assertTrue(heap_Item0.hasLeftSon());
	}

	// Heap_Item 类 start
	@Test(timeout = 4000)
	public void test00() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		Heap_Item<String> heap_Item1 = new Heap_Item<String>("4AUpzy26}'?p ");
		heap_Item0.setRightSon(heap_Item1);
		boolean boolean0 = heap_Item0.replaceChild("4AUpzy26}'?p ", heap_Item1);
		assertTrue(heap_Item0.hasRightSon());
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test01() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("3");
		heap_Item0.setRightSon(heap_Item0);
		boolean boolean0 = heap_Item0.replaceChild("", heap_Item0);
		assertTrue(heap_Item0.hasRightSon());
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test02() throws Throwable {
		Integer integer0 = new Integer(0);
		Heap_Item<Integer> heap_Item0 = new Heap_Item<Integer>(integer0);
		Heap_Item<Integer> heap_Item1 = new Heap_Item<Integer>(heap_Item0);
		heap_Item1.setLeftSon(heap_Item0);
		boolean boolean0 = heap_Item1.replaceChild(integer0, heap_Item0);
		assertTrue(heap_Item1.hasLeftSon());
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test03() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		heap_Item0.setLeftSon(heap_Item0);
		boolean boolean0 = heap_Item0.replaceChild("r", heap_Item0);
		assertTrue(heap_Item0.hasLeftSon());
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test04() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("3");
		heap_Item0.setRightSon(heap_Item0);
		heap_Item0.removeChild("");
		assertTrue(heap_Item0.hasRightSon());
	}

	@Test(timeout = 4000)
	public void test05() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("4");
		heap_Item0.setLeftSon(heap_Item0);
		heap_Item0.removeChild("");
		assertTrue(heap_Item0.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test06() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("3");
		heap_Item0.setLeftSon(heap_Item0);
		heap_Item0.getSonByData("");
		assertTrue(heap_Item0.hasLeftSon());
	}

//	@Test(timeout = 4000)
//	public void test07() throws Throwable {
//		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
//		Heap_Item<String> heap_Item1 = new Heap_Item<String>();
//		heap_Item0.setAncestor(heap_Item1);
//		heap_Item1.setAncestor(heap_Item0);
//		// Undeclared exception!
//		heap_Item0.getMultiWayAncestor();
//		System.out.println(heap_Item0.getMultiWayAncestor());
//	}

	@Test(timeout = 4000)
	public void test08() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		Heap_Item<String> heap_Item1 = new Heap_Item<String>("");
		heap_Item0.setRightSon(heap_Item1);
		Heap_Item<String> heap_Item2 = heap_Item0.getRightSon();
		assertFalse(heap_Item2.hasRightSon());
	}

	@Test(timeout = 4000)
	public void test09() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		heap_Item0.setRightSon(heap_Item0);
		heap_Item0.setLeftSon(heap_Item0);
		Heap_Item<String> heap_Item1 = heap_Item0.getRightSon();
		assertSame(heap_Item1, heap_Item0);
	}

	@Test(timeout = 4000)
	public void test10() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		heap_Item0.setAncestor(heap_Item0);
		heap_Item0.setLeftSon(heap_Item0);
		heap_Item0.setRightSon(heap_Item0);
		Heap_Item<String> heap_Item1 = heap_Item0.getMultiWayAncestor();
		assertTrue(heap_Item1.hasRightSon());
	}

	@Test(timeout = 4000)
	public void test11() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		heap_Item0.setRightSon(heap_Item0);
		heap_Item0.setLeftSon(heap_Item0);
		Heap_Item<String> heap_Item1 = heap_Item0.getLeftSon();
		assertSame(heap_Item1, heap_Item0);
	}

	@Test(timeout = 4000)
	public void test12() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		heap_Item0.setLeftSon(heap_Item0);
		Heap_Item<String> heap_Item1 = heap_Item0.getLeftSon();
		assertSame(heap_Item0, heap_Item1);
	}

	@Test(timeout = 4000)
	public void test13() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = new Heap_Item<String>();
		heap_Item1.setLeftSon(heap_Item0);
		Heap_Item<String> heap_Item2 = heap_Item1.getLeftSon();
		assertFalse(heap_Item2.hasRightSon());
	}

	@Test(timeout = 4000)
	public void test14() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		heap_Item0.setAncestor(heap_Item0);
		heap_Item0.setRightSon(heap_Item0);
		Heap_Item<String> heap_Item1 = heap_Item0.getAncestor();
		assertFalse(heap_Item1.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test15() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		heap_Item0.setLeftSon(heap_Item0);
		heap_Item0.setAncestor(heap_Item0);
		Heap_Item<String> heap_Item1 = heap_Item0.getAncestor();
		assertSame(heap_Item0, heap_Item1);
	}

	@Test(timeout = 4000)
	public void test16() throws Throwable {
		Heap_Item<Integer> heap_Item0 = new Heap_Item<Integer>();
		Heap_Item<String> heap_Item1 = new Heap_Item<String>("");
		heap_Item0.setLeftSon(heap_Item1);
		Integer integer0 = new Integer(0);
		// Undeclared exception!
		try {
			heap_Item0.replaceChild(integer0, (Heap_Item<Integer>) null);
			fail("Expecting exception: ClassCastException");

		} catch (ClassCastException e) {
//			assertEquals(null, e.getMessage());
//			assertNull(e.getMessage());
			assertEquals("java.lang.Integer cannot be cast to java.lang.String", e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test17() throws Throwable {
		Heap_Item<Integer> heap_Item0 = new Heap_Item<Integer>();
		Heap_Item<String> heap_Item1 = new Heap_Item<String>("");
		heap_Item0.setRightSon(heap_Item1);
		Integer integer0 = new Integer(0);
		// Undeclared exception!
		try {
			heap_Item0.removeChild(integer0);
			fail("Expecting exception: ClassCastException");

		} catch (ClassCastException e) {
			
//			assertEquals(null, e.getMessage());
			assertEquals("java.lang.Integer cannot be cast to java.lang.String", e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test18() throws Throwable {
		Heap_Item<Integer> heap_Item0 = new Heap_Item<Integer>();
		Heap_Item<String> heap_Item1 = new Heap_Item<String>("");
		heap_Item0.setLeftSon(heap_Item1);
		Integer integer0 = new Integer(0);
		// Undeclared exception!
		try {
			heap_Item0.getSonByData(integer0);
			fail("Expecting exception: ClassCastException");

		} catch (ClassCastException e) {
//			assertEquals(null, e.getMessage());
			assertEquals("java.lang.Integer cannot be cast to java.lang.String", e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test19() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = new Heap_Item<String>();
		heap_Item0.setAncestor(heap_Item1);
		// Undeclared exception!
		try {
			heap_Item0.getMultiWayAncestor();
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test20() throws Throwable {
		Heap_Item<Integer> heap_Item0 = null;
		try {
			heap_Item0 = new Heap_Item<Integer>((Heap_Item<Integer>) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test21() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		heap_Item0.setLeftSon(heap_Item0);
		boolean boolean0 = heap_Item0.itIsLeftSon(heap_Item0);
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test22() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		boolean boolean0 = heap_Item0.itIsLeftSon(heap_Item0);
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test23() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		heap_Item0.setRightSon(heap_Item0);
		boolean boolean0 = heap_Item0.hasRightSon();
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test24() throws Throwable {
		Heap_Item<Integer> heap_Item0 = new Heap_Item<Integer>();
		boolean boolean0 = heap_Item0.hasRightSon();
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test25() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		heap_Item0.setLeftSon(heap_Item0);
		boolean boolean0 = heap_Item0.hasLeftSon();
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test26() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		boolean boolean0 = heap_Item0.hasLeftSon();
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test27() throws Throwable {
		Heap_Item<Integer> heap_Item0 = new Heap_Item<Integer>();
		Integer integer0 = heap_Item0.getData();
		assertNull(integer0);
	}

	@Test(timeout = 4000)
	public void test28() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		String string0 = heap_Item0.getData();
		assertEquals("", string0);
	}

	@Test(timeout = 4000)
	public void test29() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = heap_Item0.getRightSon();
		assertNull(heap_Item1);
	}

	@Test(timeout = 4000)
	public void test30() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = heap_Item0.getLeftSon();
		assertNull(heap_Item1);
	}

	@Test(timeout = 4000)
	public void test31() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = heap_Item0.getAncestor();
		assertNull(heap_Item1);
	}

	@Test(timeout = 4000)
	public void test32() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		heap_Item0.setData("4AUpzy26}'?p ");
		heap_Item0.setRightSon(heap_Item0);
		boolean boolean0 = heap_Item0.replaceChild("4AUpzy26}'?p ", heap_Item0);
		assertTrue(heap_Item0.hasRightSon());
		assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void test33() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		heap_Item0.setRightSon(heap_Item0);
		heap_Item0.setData("");
		boolean boolean0 = heap_Item0.replaceChild("4", heap_Item0);
		assertTrue(heap_Item0.hasRightSon());
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test34() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		heap_Item0.setRightSon(heap_Item0);
		// Undeclared exception!
		try {
			heap_Item0.replaceChild("", heap_Item0);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
			assertEquals(null, e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test35() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("3");
		heap_Item0.setLeftSon(heap_Item0);
		boolean boolean0 = heap_Item0.replaceChild("", heap_Item0);
		assertTrue(heap_Item0.hasLeftSon());
		assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void test36() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		Heap_Item<String> heap_Item1 = new Heap_Item<String>("4AUpzy26}'?p ");
		heap_Item0.setRightSon(heap_Item1);
		assertTrue(heap_Item0.hasRightSon());

		heap_Item0.removeChild("4AUpzy26}'?p ");
		assertFalse(heap_Item0.hasRightSon());
	}

	@Test(timeout = 4000)
	public void test37() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		heap_Item0.setData("");
		heap_Item0.setRightSon(heap_Item0);
		heap_Item0.removeChild("V");
		assertTrue(heap_Item0.hasRightSon());
	}

	@Test(timeout = 4000)
	public void test38() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		heap_Item0.setData("");
		heap_Item0.setLeftSon(heap_Item0);
		heap_Item0.removeChild("V");
		assertTrue(heap_Item0.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test39() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		heap_Item0.setLeftSon(heap_Item0);
		assertTrue(heap_Item0.hasLeftSon());

		heap_Item0.removeChild("");
		assertFalse(heap_Item0.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test40() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		heap_Item0.setRightSon(heap_Item0);
		heap_Item0.setData("V}");
		heap_Item0.getSonByData("V}");
		assertTrue(heap_Item0.hasRightSon());
	}

	@Test(timeout = 4000)
	public void test41() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		heap_Item0.setData("4");
		heap_Item0.setRightSon(heap_Item0);
		heap_Item0.getSonByData("");
		assertTrue(heap_Item0.hasRightSon());
	}

	@Test(timeout = 4000)
	public void test42() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		heap_Item0.setRightSon(heap_Item0);
		// Undeclared exception!
		try {
			heap_Item0.getSonByData("");
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertEquals(null, e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test43() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		heap_Item0.setLeftSon(heap_Item0);
		heap_Item0.getSonByData("e");
		assertTrue(heap_Item0.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test44() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		heap_Item0.setLeftSon(heap_Item0);
		heap_Item0.getSonByData("");
		assertTrue(heap_Item0.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test45() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		heap_Item0.setRightSon(heap_Item0);
		// Undeclared exception!
		try {
			heap_Item0.removeChild("");
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {

			assertEquals(null, e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test46() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = new Heap_Item<String>();
		heap_Item0.setAncestor(heap_Item1);
		heap_Item1.setLeftSon(heap_Item0);
		heap_Item1.setAncestor(heap_Item0);
		Heap_Item<String> heap_Item2 = heap_Item1.getMultiWayAncestor();
		assertTrue(heap_Item2.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test47() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		Heap_Item<String> heap_Item1 = heap_Item0.getMultiWayAncestor();
		assertNull(heap_Item1);
	}

	@Test(timeout = 4000)
	public void test48() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>();
		heap_Item0.removeLeftSon();
		assertFalse(heap_Item0.hasLeftSon());
	}

	@Test(timeout = 4000)
	public void test49() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		heap_Item0.setRightSon(heap_Item0);
		heap_Item0.getSonByData("V");
		assertTrue(heap_Item0.hasRightSon());
	}

	@Test(timeout = 4000)
	public void test50() throws Throwable {
		Heap_Item<String> heap_Item0 = new Heap_Item<String>("");
		heap_Item0.removeRightSon();
		assertFalse(heap_Item0.hasLeftSon());
	}

	// Heap_Item end
	
}
