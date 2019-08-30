package com.umsl.vasylonufriyev.DataStructures;
//Binary tree code copied from: https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/

import java.io.*;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    private void printPostorder(Node node, int depth, FileWriter fs) throws IOException {
        if (node == null)
            return;

        printPostorder(node.left, depth + 1, fs);
        printPostorder(node.right, depth + 1, fs);
        for (int i = 0; i < (depth * 2); i++)
            fs.write(" ");

        fs.write(node.key + " ");

        for (Object s : node.values) {
            fs.write((String) s + " ");
        }

        fs.write("\n");
    }

    private void printInorder(Node node, int depth, FileWriter fs) throws IOException {
        if (node == null)
            return;

        printInorder(node.left, depth + 1, fs);
        for (int i = 0; i < (depth * 2); i++)
            fs.write(" ");

        fs.write(node.key + " ");

        for (Object s : node.values) {
            fs.write((String) s + " ");
        }

        fs.write("\n");
        printInorder(node.right, depth + 1, fs);
    }

    private void printPreorder(Node node, int depth, FileWriter fs) throws IOException {
        if (node == null)
            return;

        for (int i = 0; i < (depth * 2); i++)
            fs.write(" ");

        fs.write(node.key + " ");

        for (Object s : node.values) {
            fs.write((String) s + " ");
        }

        fs.write("\n");
        printPreorder(node.left, depth + 1, fs);
        printPreorder(node.right, depth + 1, fs);

    }

    public void printPostorder(String outputBaseString) {

        try {
            FileWriter fs = new FileWriter(new File("./" + outputBaseString + ".postorder"));
            printPostorder(root, 0, fs);
            fs.close();
        } catch (IOException e) {
            System.out.println("Failed to open output file stream for a traversal");
            System.exit(-1);
        }
    }

    public void printInorder(String outputBaseString) {

        try {
            FileWriter fs = new FileWriter(new File("./" + outputBaseString + ".inorder"));
            printInorder(root, 0, fs);
            fs.close();
        } catch (IOException e) {
            System.out.println("Failed to open output file stream for a traversal");
            System.exit(-1);
        }
    }

    public void printPreorder(String outputBaseString) {

        try {
            FileWriter fs = new FileWriter(new File("./" + outputBaseString + ".preorder"));
            printPreorder(root, 0, fs);
            fs.close();
        } catch (IOException e) {
            System.out.println("Failed to open output file stream for a traversal");
            System.exit(-1);
        }
    }

    public Tree buildTree(String[] dataSet) {
        for (String s : dataSet)
            insertNode(s);

        return this;
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
                } else {
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
