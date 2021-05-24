package com.corejava.DataStructures.Tree;

/* BST meets the following requirements:
 * 1.it is a binary tree
 * 2.each node contains a value
 * 3.left subtree of a node contains only values smaller than the node's value
 * 4.right subtree of a node contains only values greater than the node's value
 * 
 * so,the definition above does't allow dulicates.
 */
public class BinarySearchTreeImplementation 
{
	public Node root;
	
	public BinarySearchTreeImplementation()
	{
		root=null;
	}
	public boolean isEmpty()
	{
		return root == null;
	}
	public void add(int value)
	{
		root=add(root,value);
	}
	private Node add(Node root,int value)
	{
		if(root==null)
		{
			root = new Node(value);
		}
		else if(root.getData() > value)
		{
			root.leftChild = add(root.leftChild,value);
		}
		else if(root.getData() < value)
		{
			root.rightChild = add(root.rightChild,value);
		}
		return root;
	}
	public boolean search(int x)
	{
		return search(root,x);
	}
	private boolean search(Node node,int x)
	{
		boolean found = false;
		while((node != null) && !found)
		{
			if(node.getData() > x)
				node=node.leftChild;
			else if(node.getData() < x)
				node=node.rightChild;
			else {
				found = true;
				break;
			}
			found = search(node,x);
		}
		return found;
	}

}
