package com.umsl.vasylonufriyev.DataStructures;

import java.util.HashSet;
import java.util.Set;

class Node<T> {
    Set<T> values;
    char key;
    Node left, right;

    Node(char key, T item) {
        this.key = key;
        values = new HashSet<>();
        values.add(item);
        left = right = null;
    }

    void addValueToValues(T value) {
        values.add(value);
    }
}
