package com.jetbrains.java16.records;
import java.lang.reflect.Field;

public class UseReflection {
    public static void main(String[] args) throws Exception {
        changeFinalFieldValuesForNonRecords();
        changeFinalForRecords();
    }

    private static void changeFinalFieldValuesForNonRecords() throws NoSuchFieldException, IllegalAccessException {
        final var noteBook = new NoteBook(10);
        System.out.println(noteBook);

        Field pageCountField = noteBook.getClass().getDeclaredField("pageCount");
        pageCountField.setAccessible(true);
        int newCount = 1000;
        pageCountField.setInt(noteBook, newCount);

        System.out.println(noteBook);
    }

    private static void changeFinalForRecords() throws NoSuchFieldException, IllegalAccessException {
        final var point = new Point(12, 35);
        System.out.println(point);

        Field pageCountField = point.getClass().getDeclaredField("x");
        pageCountField.setAccessible(true);
        int newVal = 1000;
        pageCountField.setInt(point, newVal);

        System.out.println(point);
    }

}
