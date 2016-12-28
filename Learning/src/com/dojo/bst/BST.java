package com.dojo.bst;

public class BST  {
	//The main operations on a BST are
	//1)Insert
	//2)Find
	//3)Delete
	//4)Display
	//
	public static Node root;
	public BST(){
		this.root=null;
	}
	public BST(BST tree){
		this.root = tree.root;
	}
	public void insert(int data){
		// Inserting data to BST
		Node newNode = new Node(data);
		if(root==null){
			//inserting to a fresh BST
			root = newNode;
			System.out.println("entered data:"+ data);
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(data< current.data){
				current = current.left;
				if(current==null){
					parent.left = newNode;
					System.out.println("entered data:"+ data);
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNode;
					System.out.println("entered data:"+ data);
					return;
				}
			}
		}
		
	}
	public void display(Node root){
		// Operation to display a BST
		if(root!=null){
			display(root.left);
			System.out.println(" "+root.data);
			display(root.right);
		}
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
	public static void main(String[] args) {
		BST b = new BST();
		b.insert(3);
		b.insert(1);
		b.insert(2);
		b.insert(6);
		b.insert(7);
		b.insert(9);
		b.insert(30);
		b.insert(10);
		b.insert(20);
		b.insert(35);
		b.insert(15);
		b.insert(25);
		b.display(root);
		System.out.println(b.find(15));
	}
}
