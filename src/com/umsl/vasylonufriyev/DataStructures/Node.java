package com.umsl.vasylonufriyev.DataStructures;

import java.util.HashSet;
import java.util.Set;

class Node {
    Set values;
    char key;
    Node left, right;

    public Node(char key, String item) {
        this.key = key;
        values = new HashSet();
        values.add(item);
        left = right = null;
    }

    public void addValueToValues(String value) {
        values.add(value);
    }
}
