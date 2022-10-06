package com.aayush.gulia.Tree.BinarySearchTree;

/**
 * This class implements Binary search tree.
 *
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @see <a href="https://www.geeksforgeeks.org/binary-search-tree-data-structure/">Binary search tree</a>
 * @since 06/10/2022
 */

public class BinarySearchTree {

    static Node root;

    /**
     * This class defines the node structure of binary search tree.
     */
    static class Node{
        Node lChild;
        int data;
        Node rChild;

        /**
         * Creates a new node whenever this constructor is called.
         * @param lChild reference to left child of node.
         * @param data data stored inside the node.
         * @param rChild reference to right child of node.
         */

        Node(Node lChild, int data, Node rChild){
            this.lChild = lChild;
            this.data = data;
            this.rChild = rChild;
        }
    }

    /**
     * Creates a Binary Search Tree.
     * @param key element to be inserted in BST.
     */

    public static void insertElement(int key){
        Node p = root;
        Node follow = root;
        Node temp;

        temp = new Node(null, key, null);

        if (p == null){
            root = temp;
            return;
        }

        while (p != null){
            follow = p;

            if (key == p.data){
                return;
            }

            if (key < p.data){
                p = p.lChild;
            }

            else{
                p = p.rChild;
            }
        }

        if (key > follow.data){
            follow.rChild = temp;
        }
        else{
            follow.lChild = temp;
        }
    }

    /**
     * Creates a Binary search tree recursively.
     * @param p root node if BST.
     * @param key element to be inserted. (data)
     * @return root node of the tree.
     */

    public static Node recursiveInsertElement(Node p, int key){
        Node temp = new Node(null, key, null);

        if (p == null){
            p = temp;
            return p;
        }

        if(key < p.data){
            p.lChild = recursiveInsertElement(p.lChild, key);
        }

        else{
            p.rChild = recursiveInsertElement(p.rChild, key);
        }

        return p;
    }

    /**
     * Prints the inOrder traversal of Binary search tree.
     * @param p root node of binary search tree.
     */

    public static void inOrder(Node p){
        if (p != null){
            inOrder(p.lChild);
            System.out.print(p.data+ ", ");
            inOrder(p.rChild);
        }
    }

    /**
     * Search key in binary search tree iteratively.
     * @param key data to be searched in binary search tree.
     * @return node containing key.
     */

    public static Node search(int key){
        Node p = root;

        if (p == null)
            return null;

        while (p != null){
            if (key == p.data){
                return p;
            }

            if (key > p.data){
                p = p.rChild;
            }

            else{
                p = p.lChild;
            }
        }

        return null;
    }

    /**
     * Search key in binary search tree recursively.
     * @param p root node of binary search tree.
     * @param key data to be searched.
     * @return node containing key.
     */

    public static Node searchRecursive(Node p, int key){
        if (p == null){
            return null;
        }

        if (key == p.data){
            return p;
        }

        else if(key < p.data){
            return searchRecursive(p.lChild, key);
        }

        else{
            return searchRecursive(p.rChild, key);
        }
    }

    public static void main(String[] args) {
        root = recursiveInsertElement(root, 45);
        root = recursiveInsertElement(root, 12);
        root = recursiveInsertElement(root, 78);
        root = recursiveInsertElement(root, 34);
        root = recursiveInsertElement(root, 89);
        inOrder(root);

        insertElement(12);
        insertElement(2);
        insertElement(45);
        insertElement(9);
        insertElement(5);
        inOrder(root);

        Node x = searchRecursive(root, 5);

        if (x != null){
            System.out.println("");
            System.out.println(x.data);
        }
    }
}
