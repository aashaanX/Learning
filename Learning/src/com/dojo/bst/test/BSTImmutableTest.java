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

}
