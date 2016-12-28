package com.dojo.bst;

public class testImmutable {
	public static void main(String[] args) {
		ImmutableBST obj = new ImmutableBST();
		System.out.println(obj);
		obj = ImmutableBST.insert(obj, 3);
		System.out.println(obj);
		obj = ImmutableBST.insert(obj, 1);
		System.out.println(obj);
		obj = ImmutableBST.insert(obj, 4);
		System.out.println(obj);
		ImmutableBST.display(obj);
		obj = ImmutableBST.insert(obj, 2);
		System.out.println(obj);
		obj = ImmutableBST.insert(obj, 5);
		System.out.println(obj);
		ImmutableBST.display(obj);
		//obj.insert(obj, 2);
		//obj.displayValues(obj);

	}

}
