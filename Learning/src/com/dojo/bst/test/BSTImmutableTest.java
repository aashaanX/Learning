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

}
