package com.corejava.DataStructures.Tree;

public class BST {

	public static void main(String[] args) {
		BinarySearchTreeImplementation bst=new BinarySearchTreeImplementation();
		
		bst.add(5);
		bst.add(2);
		bst.add(18);
		bst.add(-4);
		bst.add(3);
		
		System.out.println(bst.search(18));

	}

}
