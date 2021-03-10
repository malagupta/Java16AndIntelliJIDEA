package com.jetbrains.java16.patternmatching;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class ProdProject extends Project {
    Tree modules;

    void process(Font font, int size) {
        final List<Node> list = modules.getChildren();
        for (Iterator<Node> i = list.iterator(); i.hasNext();) {
            final Object o = i.next();
            if (o instanceof LetterNode) {
                final LetterNode letterNode = (LetterNode) o;
                if (letterNode.isLatin()) {
                    if (isLetterTrueFont(letterNode.nodeValue, font, size)) {
                        i.remove();
                    }
                }
            }
        }
    }

    /*
    After refactoring

    void process(Font font, int size) {
        ((List<Node>) modules.getChildren()).removeIf(o -> o instanceof final LetterNode letterNode
                && letterNode.isLatin()
                && isLetterTrueFont(letterNode.nodeValue, font, size));
    }
    */

    boolean isLetterTrueFont(char letter, Font font, int size) {
        return true;
    }
}

class Font {
}

class Node {
    char nodeValue;
    public char getNodeValue() {
        return nodeValue;
    }
    public void setNodeValue(char nodeValue) {
        this.nodeValue = nodeValue;
    }
}

class Tree {
    Map<String, Node> childNodes;
    public Map<String, Node> getChildNodes() {
        return childNodes;
    }
    public void setChildNodes(Map<String, Node> childNodes) {
        this.childNodes = childNodes;
    }
    ArrayList<Node> children;
    ArrayList<Node> getChildren() {
        return children;
    }
}

class LetterNode extends Node {
    boolean isLatin() {
        return true;
    }
}