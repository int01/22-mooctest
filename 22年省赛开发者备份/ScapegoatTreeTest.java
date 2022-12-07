package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScapegoatTreeTest {

	@Test(timeout = 4000)
	public void test00() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.printTreePreOrder();
		scapegoatTree0.insert(2089);
		scapegoatTree0.insert(0);
		scapegoatTree0.insert(0);
	}

	@Test(timeout = 4000)
	public void test01() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert((-1166));
		scapegoatTree0.getMaximum(scapegoatTree0.root);
		scapegoatTree0.insert(920);
		scapegoatTree0.delete((int) abstractBinarySearchTree_Node0.value);
	}

	@Test(timeout = 4000)
	public void test02() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		Integer integer0 = new Integer(0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = new AbstractBinarySearchTree.Node(integer0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		abstractBinarySearchTree_Node0.parent = null;
		scapegoatTree0.delete(abstractBinarySearchTree_Node0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.createNode(0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		Integer.max(0, (-126));
		abstractBinarySearchTree_Node1.left = null;
		scapegoatTree0.getSubtreeSize(abstractBinarySearchTree_Node1);
		// Undeclared exception!
		try {
			scapegoatTree0.insert(450);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}
	

	@Test(timeout = 4000)
	public void test04() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree((-1.0));
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(2610);
		scapegoatTree0.root = abstractBinarySearchTree_Node0;
		int int0 = (-234);
		// Undeclared exception!
		try {
			scapegoatTree0.insert((-234));
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test05() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(1);
		scapegoatTree0.rebuildTree(1, abstractBinarySearchTree_Node0);
	}

	@Test(timeout = 4000)
	public void test06() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(0.0);
		Integer integer0 = new Integer(708);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = new AbstractBinarySearchTree.Node(integer0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0
				.getMaximum(abstractBinarySearchTree_Node0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0
				.getMinimum(abstractBinarySearchTree_Node1);
		scapegoatTree0.findScapegoatNode(abstractBinarySearchTree_Node2);
	}

	@Test(timeout = 4000)
	public void test07() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.printTreeInOrder();
		Integer integer0 = new Integer((-1048));
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = new AbstractBinarySearchTree.Node(integer0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.createNode(0,
				abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0);
		Integer integer1 = new Integer((int) abstractBinarySearchTree_Node0.value);
		abstractBinarySearchTree_Node1.value = integer1;
		abstractBinarySearchTree_Node1.right = abstractBinarySearchTree_Node0;
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0.createNode((-1048),
				abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node1, abstractBinarySearchTree_Node1);
		abstractBinarySearchTree_Node2.left = abstractBinarySearchTree_Node1.right;
		scapegoatTree0.getNodeHeight(abstractBinarySearchTree_Node1);
		abstractBinarySearchTree_Node0.parent = abstractBinarySearchTree_Node2;
		scapegoatTree0.rebuildTree(0, abstractBinarySearchTree_Node1);
		scapegoatTree0.delete(31);
	}

	@Test(timeout = 4000)
	public void test08() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree((-2388.17091965096));
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = null;
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.createNode(0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		abstractBinarySearchTree_Node1.right = null;
		scapegoatTree0.printSubtree(abstractBinarySearchTree_Node1);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0.insert(0);
		scapegoatTree0.delete((-3046));
		scapegoatTree0.getNodeHeight((AbstractBinarySearchTree.Node) null);
		scapegoatTree0.findScapegoatNode(abstractBinarySearchTree_Node2);
		scapegoatTree0.delete((-584));
		// Undeclared exception!
		try {
			scapegoatTree0.insert(0);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test09() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(1.0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert((-1099));
		Integer integer0 = new Integer((-1099));
		abstractBinarySearchTree_Node0.value = integer0;
		scapegoatTree0.createNode((-1102), abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0,
				abstractBinarySearchTree_Node0);
		scapegoatTree0.insert((-587));
	}

	@Test(timeout = 4000)
	public void test10() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(1.0);
		Integer integer0 = new Integer(3349);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = new AbstractBinarySearchTree.Node(integer0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0
				.getMaximum(abstractBinarySearchTree_Node0);
		scapegoatTree0.delete(0);
		Integer integer1 = new Integer(3349);
		abstractBinarySearchTree_Node0.value = integer1;
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0.createNode(3349,
				abstractBinarySearchTree_Node1, abstractBinarySearchTree_Node1, abstractBinarySearchTree_Node1);
		abstractBinarySearchTree_Node0.left = null;
		scapegoatTree0.printTreePostOrder();
		Integer.max((-1), 1899);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node3 = null;
		abstractBinarySearchTree_Node1.parent = null;
		Integer.max(383, 1);
		abstractBinarySearchTree_Node2.parent = abstractBinarySearchTree_Node0;
		scapegoatTree0.delete(abstractBinarySearchTree_Node2);
		scapegoatTree0.getSubtreeSize((AbstractBinarySearchTree.Node) null);
		// Undeclared exception!
		try {
			scapegoatTree0.insert(3349);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test12() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(0);
		scapegoatTree0.getNodeHeight(abstractBinarySearchTree_Node0);
	}

	@Test(timeout = 4000)
	public void test13() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree((-2197.06096897944));
		scapegoatTree0.printTreePreOrder();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert((-1395));
		scapegoatTree0.rebuildTree((int) abstractBinarySearchTree_Node0.value, abstractBinarySearchTree_Node0);
		scapegoatTree0.getNodeHeight((AbstractBinarySearchTree.Node) null);
		abstractBinarySearchTree_Node0.parent = null;
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
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(2830.3168);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.root;
		scapegoatTree0.createNode(0, (AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
	}

	@Test(timeout = 4000)
	public void test15() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(2767.3);
		scapegoatTree0.insert(1387);
	}

	@Test(timeout = 4000)
	public void test16() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.delete((-1042));
	}

	@Test(timeout = 4000)
	public void test17() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.root;
		scapegoatTree0.getSubtreeSize((AbstractBinarySearchTree.Node) null);
		int int0 = 0;
		// Undeclared exception!
		try {
			scapegoatTree0.rotateRight((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test18() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree((-1.0));
		Integer integer0 = new Integer(0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = new AbstractBinarySearchTree.Node(integer0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.createNode(0,
				abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0
				.getMaximum(abstractBinarySearchTree_Node1);
		scapegoatTree0.createNode(0, abstractBinarySearchTree_Node2, abstractBinarySearchTree_Node0,
				abstractBinarySearchTree_Node1);
	}

	@Test(timeout = 4000)
	public void test20() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert((-1166));
		scapegoatTree0.insert((int) abstractBinarySearchTree_Node0.value);
		scapegoatTree0.insert(920);
		assertEquals(920, scapegoatTree0.getMaximum());
	}

	@Test(timeout = 4000)
	public void test21() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree((-335.390004022455));
		ScapegoatTree scapegoatTree1 = new ScapegoatTree();
		scapegoatTree1.size = (-322);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree1.delete((-2880));
		assertNull(abstractBinarySearchTree_Node0);
	}

	@Test(timeout = 4000)
	public void test22() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(0.0);
		scapegoatTree0.insert(423);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.delete(1117);
		assertEquals(423, scapegoatTree0.getMaximum());
		assertNull(abstractBinarySearchTree_Node0);
	}

	@Test(timeout = 4000)
	public void test23() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.createNode(679,
				abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0
				.findScapegoatNode(abstractBinarySearchTree_Node1);
		assertNull(abstractBinarySearchTree_Node2);
		assertEquals(0, scapegoatTree0.getMinimum());
	}

	@Test(timeout = 4000)
	public void test24() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.delete(0);
		int int0 = scapegoatTree0.getSubtreeSize((AbstractBinarySearchTree.Node) null);
		assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void test25() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(0.0);
		scapegoatTree0.search(4791);
		int int0 = scapegoatTree0.getNodeHeight((AbstractBinarySearchTree.Node) null);
		assertEquals((-1), int0);
	}

	@Test(timeout = 4000)
	public void test26() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree((-726.0));
		Integer integer0 = new Integer(0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = new AbstractBinarySearchTree.Node(integer0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.createNode(0,
				abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0);
		scapegoatTree0.rebuildTree(0, abstractBinarySearchTree_Node1);
		assertTrue(abstractBinarySearchTree_Node1.equals((Object) abstractBinarySearchTree_Node0));
		assertTrue(abstractBinarySearchTree_Node0.equals((Object) abstractBinarySearchTree_Node1));
	}

	@Test(timeout = 4000)
	public void test27() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		ScapegoatTree scapegoatTree1 = new ScapegoatTree((-821.02673));
		// Undeclared exception!
		try {
			scapegoatTree0.findScapegoatNode((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test28() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.printTreeInOrder();
		scapegoatTree0.delete(31);
		// Undeclared exception!
		try {
			scapegoatTree0.rebuildTree(31, (AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			assertEquals("Index: 15, Size: 0", e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test29() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.delete(2284);
		// Undeclared exception!
		try {
			scapegoatTree0.findScapegoatNode((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test30() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree((-2303.78661));
		// Undeclared exception!
		try {
			scapegoatTree0.rebuildTree(1, (AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: IndexOutOfBoundsException");

		} catch (IndexOutOfBoundsException e) {
			assertEquals("Index: 0, Size: 0", e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test31() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.delete((-395));
		assertNull(abstractBinarySearchTree_Node0);
	}

	@Test(timeout = 4000)
	public void test32() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		int int0 = (-494);
		scapegoatTree0.insert((-494));
		scapegoatTree0.delete((-2));
		// Undeclared exception!
		try {
			scapegoatTree0.rotateLeft((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test33() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.printTreePreOrder();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert((-1395));
		scapegoatTree0.rebuildTree((int) abstractBinarySearchTree_Node0.value, abstractBinarySearchTree_Node0);
		scapegoatTree0.getNodeHeight((AbstractBinarySearchTree.Node) null);
		abstractBinarySearchTree_Node0.parent = null;
		// Undeclared exception!
		try {
			scapegoatTree0.findScapegoatNode((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test34() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.createNode((-1686), (AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		scapegoatTree0.insert(31);
		scapegoatTree0.insert(1);
		scapegoatTree0.insert((-1686));
		assertEquals((-1686), scapegoatTree0.getMinimum());
	}

	@Test(timeout = 4000)
	public void test35() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.rebuildTree(0,
				abstractBinarySearchTree_Node0);
		assertEquals(0, scapegoatTree0.getMinimum());
		assertNull(abstractBinarySearchTree_Node1);
	}

	@Test(timeout = 4000)
	public void test36() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.createNode(0,
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		assertTrue(abstractBinarySearchTree_Node0.isLeaf());
	}

	@Test(timeout = 4000)
	public void test37() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert((-1166));
		Integer integer0 = new Integer((int) abstractBinarySearchTree_Node0.value);
		abstractBinarySearchTree_Node0.value = integer0;
		scapegoatTree0.insert((int) abstractBinarySearchTree_Node0.value);
		scapegoatTree0.printTree();
		scapegoatTree0.insert(920);
		scapegoatTree0.findScapegoatNode(abstractBinarySearchTree_Node0);
		assertEquals(920, scapegoatTree0.getMaximum());
	}

	@Test(timeout = 4000)
	public void test38() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		ScapegoatTree scapegoatTree1 = new ScapegoatTree((-107));
		scapegoatTree1.delete((-107));
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.createNode((-107),
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		scapegoatTree0.root = abstractBinarySearchTree_Node0;
		scapegoatTree0.delete(0);
		// Undeclared exception!
		try {
			scapegoatTree0.findScapegoatNode((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

}
