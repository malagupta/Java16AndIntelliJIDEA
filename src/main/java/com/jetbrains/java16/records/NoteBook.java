package com.jetbrains.java16.records;

public class NoteBook {
    private final int pageCount;

    public NoteBook(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "NoteBook{" + "pageCount=" + pageCount + '}';
    }
}
