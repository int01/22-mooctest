package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class AbstractBinarySearchTreeTest {
	  
	@Test(timeout = 4000)
	public void test02() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		int int0 = (-2028);
		Integer integer0 = new Integer((-2028));
		scapegoatTree0.rebuildTree(0, (AbstractBinarySearchTree.Node) null);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = new AbstractBinarySearchTree.Node(integer0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0
				.getMinimum(abstractBinarySearchTree_Node0);
		int int1 = 2743;
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0.insert(2743);
		abstractBinarySearchTree_Node1.right = abstractBinarySearchTree_Node2;
		scapegoatTree0.rotateLeft(abstractBinarySearchTree_Node1);
		scapegoatTree0.search(0);
		String string0 = "";
		// Undeclared exception!
		try {
			scapegoatTree0.getSuccessor(1);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test03() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(1.0);
		scapegoatTree0.printTreePostOrder();
		scapegoatTree0.insert(1);
		scapegoatTree0.getMaximum();
	}

	@Test(timeout = 4000)
	public void test04() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0
				.insert((int) abstractBinarySearchTree_Node0.value);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0.createNode(0,
				abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node1);
		scapegoatTree0.printSubtree(abstractBinarySearchTree_Node2);
		scapegoatTree0.rebuildTree((-1139), abstractBinarySearchTree_Node2);
		scapegoatTree0.insert(0);
	}

	@Test(timeout = 4000)
	public void test05() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		int int0 = 0;
		Integer integer0 = new Integer(0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(0);
		scapegoatTree0.rebuildTree(0, abstractBinarySearchTree_Node0);
		abstractBinarySearchTree_Node0.parent = scapegoatTree0.root;
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = new AbstractBinarySearchTree.Node(integer0,
				scapegoatTree0.root, (AbstractBinarySearchTree.Node) null, scapegoatTree0.root);
		abstractBinarySearchTree_Node0.parent = abstractBinarySearchTree_Node1;
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0
				.getMaximum(abstractBinarySearchTree_Node1);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node3 = scapegoatTree0
				.getMinimum(abstractBinarySearchTree_Node2);
		int int1 = 2743;
		abstractBinarySearchTree_Node3.right = abstractBinarySearchTree_Node0.parent;
		abstractBinarySearchTree_Node0.parent = abstractBinarySearchTree_Node2;
		scapegoatTree0.rotateLeft(abstractBinarySearchTree_Node3);
		scapegoatTree0.search(0);
		try {
			Integer.decode("");
			fail("Expecting exception: NumberFormatException");

		} catch (NumberFormatException e) {
			assertEquals("Zero length string", e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test06() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(2818.879862);
		Integer integer0 = Integer.getInteger("2#X<6:a;`<%5b.e.", 2199);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert((-4551));
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.insert(2199);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = new AbstractBinarySearchTree.Node(integer0,
				scapegoatTree0.root, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node1);
		scapegoatTree0.search(3100);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node3 = scapegoatTree0.createNode(2199,
				abstractBinarySearchTree_Node2, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		scapegoatTree0.delete((int) abstractBinarySearchTree_Node0.value);
		abstractBinarySearchTree_Node0.parent = null;
		scapegoatTree0.rebuildTree((-4551), abstractBinarySearchTree_Node3);
		// Undeclared exception!
		try {
			scapegoatTree0.findScapegoatNode((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test07() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.insert((-1482));
		abstractBinarySearchTree_Node0.parent = abstractBinarySearchTree_Node1;
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0
				.delete(abstractBinarySearchTree_Node0);
		scapegoatTree0.getMinimum(abstractBinarySearchTree_Node2);
		scapegoatTree0.getMaximum();
	}
	

	@Test(timeout = 4000)
	public void test11() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.printTreePreOrder();
		int int0 = 0;
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(0);
		scapegoatTree0.printSubtree(abstractBinarySearchTree_Node0);
		int int1 = 2191;
		Integer integer0 = new Integer((-1130));
		scapegoatTree0.delete(0);
		scapegoatTree0.delete((AbstractBinarySearchTree.Node) null);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = new AbstractBinarySearchTree.Node(integer0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		// Undeclared exception!
		try {
			scapegoatTree0.rotateRight(abstractBinarySearchTree_Node1);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test12() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		int int0 = 0;
		int int1 = 1442;
		scapegoatTree0.insert(1442);
		Integer integer0 = new Integer(0);
		Integer.getInteger("");
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = new AbstractBinarySearchTree.Node(integer0,
				scapegoatTree0.root, scapegoatTree0.root, scapegoatTree0.root);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0
				.getMinimum(abstractBinarySearchTree_Node0);
		abstractBinarySearchTree_Node0.left = abstractBinarySearchTree_Node1;
		abstractBinarySearchTree_Node1.value = abstractBinarySearchTree_Node0.value;
		abstractBinarySearchTree_Node0.parent = scapegoatTree0.root;
		try {
			Integer.decode("");
			fail("Expecting exception: NumberFormatException");

		} catch (NumberFormatException e) {
			assertEquals("Zero length string", e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test13() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(2818.879862);
		Integer integer0 = Integer.getInteger("2#X<6:a;`<%5b.e.", 2199);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert((-4551));
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.insert(2199);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = new AbstractBinarySearchTree.Node(integer0,
				scapegoatTree0.root, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node1);
		scapegoatTree0.search(3100);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node3 = scapegoatTree0.createNode(2199,
				abstractBinarySearchTree_Node2, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		scapegoatTree0.rebuildTree((-4551), abstractBinarySearchTree_Node3);
		// Undeclared exception!
		try {
			scapegoatTree0.findScapegoatNode((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test14() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		// Undeclared exception!
		try {
			scapegoatTree0.getMinimum();
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test15() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(3153.1615808585375);
		scapegoatTree0.delete((-234));
		scapegoatTree0.delete((AbstractBinarySearchTree.Node) null);
		scapegoatTree0.insert(1);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.search(1);
		scapegoatTree0.createNode(31, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0,
				abstractBinarySearchTree_Node0);
		// Undeclared exception!
		try {
			scapegoatTree0.getSuccessor(0);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test16() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.contains(249);
	}

	@Test(timeout = 4000)
	public void test17() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(1);
		scapegoatTree0.rebuildTree(0, abstractBinarySearchTree_Node0);
		scapegoatTree0.delete((-740));
		scapegoatTree0.getMinimum();
		scapegoatTree0.printTreeInOrder();
		// Undeclared exception!
		try {
			scapegoatTree0.getMinimum((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test18() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(705);
		scapegoatTree0.findScapegoatNode(abstractBinarySearchTree_Node0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.insert((-1470));
		scapegoatTree0.root = abstractBinarySearchTree_Node1;
		scapegoatTree0.search((-5575));
		scapegoatTree0.getMaximum();
		scapegoatTree0.printTree();
		abstractBinarySearchTree_Node1.right = scapegoatTree0.root;
		// Undeclared exception!
		try {
			scapegoatTree0.findScapegoatNode((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test20() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		int int0 = 1;
		scapegoatTree0.delete(1);
		scapegoatTree0.delete((AbstractBinarySearchTree.Node) null);
		scapegoatTree0.delete((AbstractBinarySearchTree.Node) null);
		int int1 = 0;
		scapegoatTree0.contains(0);
		// Undeclared exception!
		try {
			scapegoatTree0.getMaximum();
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test22() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert((-4128));
		abstractBinarySearchTree_Node0.parent = scapegoatTree0.root;
		scapegoatTree0.getMaximum(abstractBinarySearchTree_Node0);
		scapegoatTree0.delete(1451);
		scapegoatTree0.delete((AbstractBinarySearchTree.Node) null);
	}

	@Test(timeout = 4000)
	public void test24() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(434.0667345592956);
		scapegoatTree0.insert((-1));
		scapegoatTree0.getSize();
		scapegoatTree0.getMaximum();
		scapegoatTree0.printTreeInOrder();
	}

	@Test(timeout = 4000)
	public void test25() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.printTreePostOrder();
		int int0 = (-1);
		// Undeclared exception!
		try {
			scapegoatTree0.getSuccessor((-1));
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test26() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(3153.1615808585375);
		// Undeclared exception!
		try {
			scapegoatTree0.getSuccessor(0);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test27() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.search(461);
	}

	@Test(timeout = 4000)
	public void test28() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.insert((-761));
	}

	@Test(timeout = 4000)
	public void test29() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(0.0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.createNode(0,
				abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0);
		scapegoatTree0.getNodeHeight(abstractBinarySearchTree_Node1);
	}

	@Test(timeout = 4000)
	public void test30() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(1174.42);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert((-1));
		scapegoatTree0.getSuccessor(abstractBinarySearchTree_Node0);
		scapegoatTree0.root = null;
		// Undeclared exception!
		try {
			scapegoatTree0.printTree();
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test31() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		int int0 = 31;
		scapegoatTree0.delete(1);
		// Undeclared exception!
		try {
			scapegoatTree0.getMaximum((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test32() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = null;
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.createNode(0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		Integer integer0 = new Integer(0);
		abstractBinarySearchTree_Node1.value = integer0;
		// Undeclared exception!
		try {
			scapegoatTree0.getSuccessor((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test33() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.printTreeInOrder();
		scapegoatTree0.getSize();
		scapegoatTree0.delete(3182);
		// Undeclared exception!
		try {
			scapegoatTree0.printSubtree((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test34() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		Integer integer0 = new Integer(0);
		// Undeclared exception!
		try {
			scapegoatTree0.printTree();
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test35() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(0.0);
		int int0 = (-2733);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert((-2733));
		scapegoatTree0.insert(1215);
		scapegoatTree0.delete(abstractBinarySearchTree_Node0);
		// Undeclared exception!
		try {
			scapegoatTree0.rebuildTree(689, (AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			assertEquals("Index: 344, Size: 0", e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test36() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(2818.879862);
		Integer integer0 = Integer.getInteger("2#X<6:a;`<%5b.e.", 2199);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert((-4551));
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.insert(2199);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = new AbstractBinarySearchTree.Node(integer0,
				scapegoatTree0.root, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node1);
		scapegoatTree0.search(3100);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node3 = scapegoatTree0.createNode(2199,
				abstractBinarySearchTree_Node2, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		scapegoatTree0.delete((int) abstractBinarySearchTree_Node0.value);
		abstractBinarySearchTree_Node0.parent = null;
		scapegoatTree0.rebuildTree((-4551), abstractBinarySearchTree_Node3);
		scapegoatTree0.insert((-5575));
		scapegoatTree0.printTreePreOrder();
		scapegoatTree0.printTreePostOrder();
	}

	@Test(timeout = 4000)
	public void test37() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		assertEquals(0, scapegoatTree0.getSize());
		assertNotNull(scapegoatTree0);

		Integer integer0 = new Integer(0);
		assertEquals(0, (int) integer0);
		assertNotNull(integer0);

		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = new AbstractBinarySearchTree.Node(integer0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		assertTrue(abstractBinarySearchTree_Node0.isLeaf());
		assertNotNull(abstractBinarySearchTree_Node0);

		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0
				.getMinimum(abstractBinarySearchTree_Node0);
		assertEquals(0, scapegoatTree0.getSize());
		assertTrue(abstractBinarySearchTree_Node0.isLeaf());
		assertTrue(abstractBinarySearchTree_Node1.isLeaf());
		assertNotNull(abstractBinarySearchTree_Node1);
		assertSame(abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node1);
		assertSame(abstractBinarySearchTree_Node1, abstractBinarySearchTree_Node0);

		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0
				.getSuccessor(abstractBinarySearchTree_Node1);
		assertEquals(0, scapegoatTree0.getSize());
		assertTrue(abstractBinarySearchTree_Node0.isLeaf());
		assertTrue(abstractBinarySearchTree_Node1.isLeaf());
		assertNull(abstractBinarySearchTree_Node2);
		assertSame(abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node1);
		assertSame(abstractBinarySearchTree_Node1, abstractBinarySearchTree_Node0);

		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node3 = scapegoatTree0
				.delete((AbstractBinarySearchTree.Node) null);
		assertEquals(0, scapegoatTree0.getSize());
		assertNull(abstractBinarySearchTree_Node3);

		scapegoatTree0.printTreePreOrder();
		assertEquals(0, scapegoatTree0.getSize());

		scapegoatTree0.printTreePostOrder();
		assertEquals(0, scapegoatTree0.getSize());
	}

	@Test(timeout = 4000)
	public void test38() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(0.57);
		assertEquals(0, scapegoatTree0.getSize());
		assertNotNull(scapegoatTree0);

		Integer integer0 = new Integer(64);
		assertEquals(64, (int) integer0);
		assertNotNull(integer0);

		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = new AbstractBinarySearchTree.Node(integer0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		assertTrue(abstractBinarySearchTree_Node0.isLeaf());
		assertNotNull(abstractBinarySearchTree_Node0);

		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0
				.delete(abstractBinarySearchTree_Node0);
		assertEquals((-1), scapegoatTree0.getSize());
		assertTrue(abstractBinarySearchTree_Node0.isLeaf());
		assertNull(abstractBinarySearchTree_Node1);

		// Undeclared exception!
		try {
			scapegoatTree0.rotateRight((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test39() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		assertEquals(0, scapegoatTree0.getSize());
		assertNotNull(scapegoatTree0);

		// Undeclared exception!
		try {
			scapegoatTree0.printTree();
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test40() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(0.0);
		assertEquals(0, scapegoatTree0.getSize());
		assertNotNull(scapegoatTree0);

		int int0 = 0;
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.delete(150);
		assertEquals(0, scapegoatTree0.getSize());
		assertNull(abstractBinarySearchTree_Node0);

		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.rebuildTree(0,
				(AbstractBinarySearchTree.Node) null);
		assertEquals(0, scapegoatTree0.getSize());
		assertNull(abstractBinarySearchTree_Node1);

		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0.delete(0);
		assertEquals(0, scapegoatTree0.getSize());
		assertNull(abstractBinarySearchTree_Node2);

		// Undeclared exception!
		try {
			scapegoatTree0.getSuccessor(0);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test42() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0
				.insert((int) abstractBinarySearchTree_Node0.value);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0.createNode(0,
				abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node1);
		scapegoatTree0.printSubtree(abstractBinarySearchTree_Node2);
		scapegoatTree0.getNodeHeight(abstractBinarySearchTree_Node0);
		scapegoatTree0.getSuccessor(abstractBinarySearchTree_Node2);
		assertEquals(2, scapegoatTree0.getSize());
	}

	@Test(timeout = 4000)
	public void test43() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(5350.0);
		int int0 = 0;
		Integer integer0 = new Integer(0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = new AbstractBinarySearchTree.Node(integer0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.createNode((-1),
				abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0);
		// Undeclared exception!
		try {
			scapegoatTree0.rebuildTree(283, abstractBinarySearchTree_Node1);
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			assertEquals("Index: 141, Size: 3", e.getMessage());
		}
	}

}
