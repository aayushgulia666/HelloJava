package com.aayush.gulia.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * This class implements a binary tree using linked representation with the help of a queue data structure.
 *
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @since 29/09/2022
 * @see <a href="https://en.wikipedia.org/wiki/Binary_tree">Binary Tree</a>
 */

public class BinaryTree {

    /**
     * Global references.
     */

    static Node root;
    static Queue<Node> queue = new LinkedList<Node>();
    static Scanner scanner = new Scanner(System.in);

    static Stack<Node> stack = new Stack<>();

    /**
     * Node class defines the structure of nodes in binary tree.
     */

    static class Node{
        Node lChild;
        int data;
        Node rChild;

        /**
         * Creates a new node whenever this constructor is called.
         * @param lChild reference to left child of binary tree.
         * @param data data stored in the node.
         * @param rChild reference to right child of binary tree.
         */

        Node(Node lChild, int data, Node rChild){
            this.lChild = lChild;
            this.data = data;
            this.rChild = rChild;
        }
    }

    /**
     * Creates a binary tree.
     */

    public static void createBinaryTree(){
        Node p, t;
        int x;

        // create root node.

        System.out.println("Enter root value: ");
        x = scanner.nextInt();
        root = new Node(null, x, null);

        queue.add(root);

        // keep adding elements until the queue is empty.

        while (!queue.isEmpty()){

            p = queue.remove();

            // Left child.

            System.out.println("Enter left child of " + p.data + ": ");
            x = scanner.nextInt();

            if (x != -1){ // -1 --> node does not exist.
                t = new Node(null, x, null);
                p.lChild = t;
                queue.add(t);
            }

            // Right child.

            System.out.println("Enter right child of " + p.data + ": ");
            x = scanner.nextInt();

            if (x != -1){
                t = new Node(null, x, null);
                p.rChild = t;
                queue.add(t);
            }
        }
    }

    /**
     * Displays preorder traversal of a binary tree.
     * @param node root node of binary tree.
     */

    static void preOrder(Node node){
        if (node != null){
            System.out.print(node.data + " ");
            preOrder(node.lChild);
            preOrder(node.rChild);
        }
    }

    /**
     * Displays InOrder tree traversal.
     * @param node root node of tree.
     */

    static void inOrder(Node node){
        if (node != null){
            preOrder(node.lChild);
            System.out.print(node.data + " ");
            preOrder(node.rChild);
        }
    }

    /**
     * Displays PostOrder tree traversal
     * @param node root node of binary tree.
     */

    static void postOrder(Node node){
        if (node != null){
            preOrder(node.lChild);
            preOrder(node.rChild);
            System.out.print(node.data + " ");
        }
    }

    /**
     * Displays PreOrder tree traversal iteratively.
     * @param node root node of binary tree.
     */

    public static void preOrderIterative(Node node){

        while (node != null || !stack.isEmpty()){

            if (node != null){
                System.out.print(node.data + " ");
                stack.push(node);
                node = node.lChild;
            }

            else {
                node = stack.pop();
                node = node.rChild;
            }
        }
    }

    /**
     * Displays Inorder tree traversal of a binary tree.
     * @param node root node if binary tree.
     */

    public static void inOrderIterative(Node node){
        while (node != null || !stack.isEmpty()){

            if (node != null){
                stack.push(node);
                node = node.lChild;
            }

            else {
                node = stack.pop();
                System.out.print(node.data + " ");
                node = node.rChild;
            }
        }
    }

    public static void postOrderIterative(Node node){
        //@TODO: complete postOrderIterative()
    }


    /**
     * Displays Level order binary tree traversal.
     *
     * This method uses a queue.
     * @param node root node of binary tree.
     */

    public static void levelOrderIterative(Node node){
        Queue<Node> que = new LinkedList<Node>();

        System.out.print(node.data + " ");
        que.add(node);

        while (!que.isEmpty()){
            node = que.remove();

            if (node.lChild != null){
                System.out.print(node.lChild.data + " ");
                que.add(node.lChild);
            }

            if (node.rChild != null){
                System.out.print(node.rChild.data + " ");
                que.add(node.rChild);
            }
        }
    }

    /**
     * Counts the number of nodes in a binary tree.
     *
     * @param node root of binary tree.
     * @return number of nodes in binary tree.
     */

    public static int countOfNodes(Node node){
        int x,y;

        if (node != null){
            x = countOfNodes(node.lChild);
            y = countOfNodes(node.rChild);

            return x+y+1;
        }

        return 0;
    }

    /**
     * Returns sum of all the elements in binary tree.
     * @param node root of binary tree.
     * @return sum of all nodes.
     */

    public static int sumOfAllNodes(Node node){
        int x,y;

        if (node != null){
            x = sumOfAllNodes(node.lChild);
            y = sumOfAllNodes(node.rChild);

            return x+y+node.data;
        }

        return 0;
    }

    /**
     * Returns height of binary tree.
     * @param root root node of binary tree.
     * @return height of binary tree.
     */

    public static int height(Node root){

        if (root == null){
            return 0;
        }

        return Math.max(height(root.lChild), height(root.rChild)) + 1;
    }
}
