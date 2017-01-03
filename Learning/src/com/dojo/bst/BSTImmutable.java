package com.dojo.bst;

public final class BSTImmutable {
	private Node root = null;
	
	public BSTImmutable(BSTImmutable bst) {
		// TODO Auto-generated constructor stub
		this.root = bst.root;
	}
	
	public BSTImmutable insert(BSTImmutable bst ,Node node){
		BSTImmutable bst_return = new BSTImmutable(bst);
		if(bst.root==null){
			bst_return.root=node;
		}
		Node current = bst_return.root;
		Node parent = null;
		while(true){
			parent = current;
			if(node.data < current.data){
				current = current.left;
				if(current==null){
					parent.left = node;
					System.out.println("entered data:"+ node.data);
					return bst_return;
				}
			}else if(node.data > current.data){
				current = current.right;
				if(current==null){
					parent.right = node;
					System.out.println("entered data:"+ node.data);
					return bst_return;
				}
			}else{
				System.out.println("Node already Exist");
				return bst_return;
			}
		}
	}
	
	public void displayByNode(Node root){
		// Operation to display a BST
		if(root!=null){
			displayByNode(root.left);
			System.out.println(" "+root.data);
			displayByNode(root.right);
		}
	}
	
	public void display(BSTImmutable bst){
		displayByNode(bst.root);
	}
	
	public boolean find(int data){
		// to find an element in BST
		Node current = root;
		while(current!=null){
			if(current.data==data){
				return true;
			}else if(current.data>data){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return false;
	}
}
