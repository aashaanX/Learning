package com.dojo.bst;

public final class ImmutableBST {
	private final BST bst;
	public ImmutableBST(ImmutableBST tree) {
		// TODO Auto-generated constructor stub
		if(tree==null){
			this.bst = null;
		}else{
			this.bst = tree.bst;
		}
	}
	public ImmutableBST(BST tree){
		this.bst = tree;
	}
	public ImmutableBST(){
		this.bst = null;
	}
	
	public static void display(ImmutableBST tree){
		tree.bst.display(tree.bst.root);
	}
	public static ImmutableBST insert(ImmutableBST tree,int data){
		BST temp = null;
		if (tree.bst==null){
			temp = new BST();
			temp.root = null;
		}else{
			temp = new BST(tree.bst);
			temp = tree.bst;
		}
		temp.insert(data);
		return new ImmutableBST(temp);		
	}
	
}
