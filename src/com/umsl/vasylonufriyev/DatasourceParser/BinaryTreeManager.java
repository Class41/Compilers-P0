package com.umsl.vasylonufriyev.DatasourceParser;

import com.umsl.vasylonufriyev.DataStructures.BinaryTree;

public class BinaryTreeManager {
    private BinaryTree tree;
    private String[] dataSet;

    public BinaryTreeManager(String[] dataSet) {
        this.tree = new BinaryTree();
        this.dataSet = dataSet;
    }

    public BinaryTreeManager buildTree() {
        for (String s : dataSet) {
            tree.insertNode(s);
        }

        return this;
    }

    public void setDataSet(String[] dataSet) {
        this.dataSet = dataSet;
    }

    public String[] getDataSet() {
        return dataSet;
    }

    public BinaryTree getTree() {
        return tree;
    }
}
