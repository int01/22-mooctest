package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class AbstractSelfBalancingBinarySearchTreeTest {

	@Test
	public void test() {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.createNode((-3252),
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = new AbstractBinarySearchTree.Node(
				abstractBinarySearchTree_Node0.value, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0,
				abstractBinarySearchTree_Node0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0
				.rotateRight(abstractBinarySearchTree_Node1);
		scapegoatTree0.rotateLeft(abstractBinarySearchTree_Node1);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node3 = scapegoatTree0
				.rotateRight(abstractBinarySearchTree_Node2);
		assertTrue(abstractBinarySearchTree_Node1.isLeaf());
		assertSame(abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node3);
	}

	@Test(timeout = 4000)
	public void test0() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		scapegoatTree0.insert(0);
		scapegoatTree0.insert(0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(1);
		scapegoatTree0.insert((int) scapegoatTree0.root.value);
		scapegoatTree0.rotateRight(abstractBinarySearchTree_Node0);
		assertEquals(1, scapegoatTree0.getMaximum());
	}

	@Test(timeout = 4000)
	public void test1() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(0.0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(0);
		abstractBinarySearchTree_Node0.right = scapegoatTree0.root;
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.createNode(0,
				abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0
				.rotateLeft(abstractBinarySearchTree_Node1);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node3 = scapegoatTree0.createNode(0,
				abstractBinarySearchTree_Node2, abstractBinarySearchTree_Node0.right.parent,
				abstractBinarySearchTree_Node0.parent);
		assertFalse(abstractBinarySearchTree_Node3.isLeaf());

		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node4 = scapegoatTree0
				.rotateLeft(abstractBinarySearchTree_Node3);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node5 = scapegoatTree0
				.rotateRight(abstractBinarySearchTree_Node2.right);
		assertSame(abstractBinarySearchTree_Node2, abstractBinarySearchTree_Node4);
		assertSame(abstractBinarySearchTree_Node5, abstractBinarySearchTree_Node3);
	}

	@Test(timeout = 4000)
	public void test2() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(0.0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(0);
		abstractBinarySearchTree_Node0.right = scapegoatTree0.root;
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.createNode(0,
				abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0
				.rotateRight(abstractBinarySearchTree_Node1);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node3 = scapegoatTree0.createNode(0, scapegoatTree0.root,
				abstractBinarySearchTree_Node2, abstractBinarySearchTree_Node0.parent);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node4 = scapegoatTree0
				.rotateLeft(abstractBinarySearchTree_Node3);
		assertNotSame(abstractBinarySearchTree_Node4, abstractBinarySearchTree_Node2);
		assertNotSame(abstractBinarySearchTree_Node4, abstractBinarySearchTree_Node3);
	}

	@Test(timeout = 4000)
	public void test3() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(0.0);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert(0);
		abstractBinarySearchTree_Node0.right = scapegoatTree0.root;
		abstractBinarySearchTree_Node0.right.parent = scapegoatTree0.root;
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.createNode(0,
				abstractBinarySearchTree_Node0.right, abstractBinarySearchTree_Node0.right.parent,
				abstractBinarySearchTree_Node0);
		scapegoatTree0.rotateRight(abstractBinarySearchTree_Node1);
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0
				.rotateLeft(abstractBinarySearchTree_Node0.right.right);
		assertFalse(abstractBinarySearchTree_Node0.isLeaf());
		assertNotSame(abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node2);
	}

	@Test(timeout = 4000)
	public void test4() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(0.0);
		// Undeclared exception!
		try {
			scapegoatTree0.rotateRight((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test5() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree(0.0);
		// Undeclared exception!
		try {
			scapegoatTree0.rotateLeft((AbstractBinarySearchTree.Node) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test6() throws Throwable {
		ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.insert((-326));
		AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = scapegoatTree0.insert(0);
		scapegoatTree0.rotateLeft(abstractBinarySearchTree_Node0);
		scapegoatTree0.rotateRight(abstractBinarySearchTree_Node1);
		assertEquals(0, scapegoatTree0.getMaximum());
	}

}
