package com.dojo.bst;

public final class BSTImmutable {
	private Node root;
	
	public BSTImmutable() {
		// TODO Auto-generated constructor stub
	}
	
	public BSTImmutable(BSTImmutable bst) {
		// TODO Auto-generated constructor stub
		this.root = bst.root;
	}
	
	public BSTImmutable insert(BSTImmutable bst ,Node node){
		BSTImmutable bst_return = new BSTImmutable(bst);
		if(bst.root==null){
			bst_return.root=node;
			return bst_return;
		}
		Node current = bst_return.root;
		Node parent = null;
		while(true){
			parent = current;
			if(node.data < current.data){
				current = current.left;
				if(current==null){
					parent.left = node;
					return bst_return;
				}
			}else if(node.data > current.data){
				current = current.right;
				if(current==null){
					parent.right = node;
					return bst_return;
				}
			}else{
				// Node alredy Exist so no new bst will be created
				return bst;
			}
		}
	}
	
	private void displayByNode(Node root){
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
	
	public Object getDataLeft(int key){
		Node current = root;
		while(current!=null){
			if (key==current.data){
				return current.left.data;
			}else if(current.data>key){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return null;
	}
	
	public Object getDataRight(int key){
		Node current = root;
		while(current!=null){
			if (key==current.data){
				return current.right.data;
			}else if(current.data>key){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return null;
	}
	public BSTImmutable delete(BSTImmutable bst,Node node){
		BSTImmutable bst_return = new BSTImmutable();
		Node current = bst_return.root;
		Node parent = null;
		while(true){
			parent = current;
			if(node.data < current.data){
				current=current.left;
			}else if(node.data>current.data){
				current = current.right;
			}else{
				if(current.data<parent.data){
					if(current.right!=null){
						
					}
					
				}
			}
			return bst_return;	
		}
		
		
	}
}
