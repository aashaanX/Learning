package com.dojo.bst.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.dojo.bst.BSTImmutable;
import com.dojo.bst.Node;

public class BSTImmutableTest {
	
	@Test
	public void test(){
		int x=1;
		int y=1;
		assertEquals(2, x+y);
	}
	
	@Test
	public void testInsertToEmpty(){
		Node node = new Node(10);
		BSTImmutable bst = new BSTImmutable(); 
		assertNotEquals(bst, bst.insert(bst, node));
		assertFalse(bst.find(10));
		assertFalse(!(bst.insert(bst, node).find(10)));
		//assertNotNull(new_bst);
	}
	
	@Test
	public void testInsert(){
		Node node = new Node(10);
		Node node2 = new Node(100);
		BSTImmutable bst = new BSTImmutable();
		assertNotEquals(bst, bst.insert(bst, node));
		assertNotEquals(bst.insert(bst, node),bst.insert(bst, node).insert(bst.insert(bst, node), node2));
		assertFalse(!(bst.insert(bst, node).insert(bst, node2).find(100)));
	}
	
	@Test
	public void testInsertSameNode(){
		Node node = new Node(10);
		BSTImmutable bst = new BSTImmutable();
		bst.insert(bst, node).insert(bst, node);
		assertNotEquals(bst.insert(bst, node), bst.insert(bst, node).insert(bst.insert(bst, node), node));
	}
	
	@Test
	public void testFind(){
		Node node = new Node(10);
		Node node2 = new Node(11);
		BSTImmutable bst = new BSTImmutable();
		bst = bst.insert(bst, node);
		assertFalse(!(bst.find(10)));
		bst = bst.insert(bst, node2);
		assertFalse(!(bst.find(11)));
		assertFalse(!(bst.find(10)));
		Node node3 = new Node(9);
		bst = bst.insert(bst, node3);
		assertFalse(!(bst.find(9)));
		assertFalse(!(bst.find(11)));
		assertFalse(!(bst.find(10)));
	}
	
	@Test
	public void testInsertOrder(){
		Node node = new Node(10);
		Node node2 = new Node(11);
		Node node3 = new Node(9);
		BSTImmutable bst = new BSTImmutable();
		bst = bst.insert(bst, node);
		bst = bst.insert(bst, node2);
		bst = bst.insert(bst, node3);
		node = new Node(1);
		node2 = new Node(2);
		bst = bst.insert(bst, node);
		bst = bst.insert(bst, node2);
		bst = bst.insert(bst, new Node(20));
		bst = bst.insert(bst, new Node(15));
		assertFalse(!(bst.find(10)));
		assertFalse(!(bst.find(11)));
		assertFalse(!(bst.find(9)));
		assertEquals(bst.getDataLeft(10), 9);
		assertEquals(bst.getDataRight(10), 11);
		assertEquals(bst.getDataLeft(9),1);
		assertEquals(bst.getDataRight(1),2);
		assertEquals(bst.getDataRight(11),20);
		assertEquals(bst.getDataLeft(20),15);
	}

}
