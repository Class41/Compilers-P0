package com.umsl.vasylonufriyev.DataStructures;
//Binary tree code copied from: https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    void printPostorder(Node node, int depth) {
        if (node == null)
            return;

        printPostorder(node.left, depth + 1);
        printPostorder(node.right, depth + 1);
        for (int i = 0; i < (depth * 2); i++)
            System.out.print(" ");
        System.out.print(node.key + " ");

        for (Object s : node.values) {
            System.out.print((String) s + " ");
        }

        System.out.print("\n");
    }

    void printInorder(Node node, int depth) {
        if (node == null)
            return;

        printInorder(node.left, depth + 1);
        for (int i = 0; i < (depth * 2); i++)
            System.out.print(" ");
        System.out.print(node.key + " ");

        for (Object s : node.values) {
            System.out.print((String) s + " ");
        }

        System.out.print("\n");
        printInorder(node.right, depth + 1);
    }

    void printPreorder(Node node, int depth) {
        if (node == null)
            return;

        for (int i = 0; i < (depth * 2); i++)
            System.out.print(" ");
        System.out.print(node.key + " ");

        for (Object s : node.values) {
            System.out.print((String) s + " ");
        }

        System.out.print("\n");
        printPreorder(node.left, depth + 1);
        printPreorder(node.right, depth + 1);
    }

    public void printPostorder(String outputBaseString) {
        printPostorder(root, 0);
    }

    public void printInorder(String outputBaseString) {
        printInorder(root, 0);
    }

    public void printPreorder(String outputBaseString) {
        printPreorder(root, 0);
    }

    public void insertNode(String s) {
        char key = s.charAt(0);

        if (root == null) {
            root = new Node<String>(key, s);
        } else {
            Node currentNode = root;
            boolean placed = false;

            while (!placed) {
                if (key == currentNode.key) {
                    currentNode.addValueToValues(s);
                    placed = true;
                } else if (key > currentNode.key) {
                    if (currentNode.right != null) {
                        currentNode = currentNode.right;
                    } else {
                        currentNode.right = new Node<String>(key, s);
                        placed = true;
                    }
                } else if (key < currentNode.key) {
                    if (currentNode.left != null) {
                        currentNode = currentNode.left;
                    } else {
                        currentNode.left = new Node<String>(key, s);
                        placed = true;
                    }
                }
            }
        }
    }
}
