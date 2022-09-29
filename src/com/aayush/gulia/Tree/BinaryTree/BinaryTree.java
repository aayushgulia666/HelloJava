package com.aayush.gulia.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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

            System.out.println("Enter left child: ");
            x = scanner.nextInt();

            if (x != -1){ // -1 --> node does not exist.
                t = new Node(null, x, null);
                p.lChild = t;
                queue.add(t);
            }

            // Right child.

            System.out.println("Enter right child: ");
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

    static void postOrder(Node node){
        if (node != null){
            preOrder(node.lChild);
            preOrder(node.rChild);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        createBinaryTree();

        System.out.println();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}
