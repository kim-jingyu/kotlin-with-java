package com.lannstark.lec16;

import java.util.List;

class Generic <T extends Number>{
    public <T> void printAll(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
    }

    // Unbounded Wildcards
    public void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Upper Bounded Wildcards
    public double sum(List<? extends Number> list) {
        double total = 0;
        for (Number element : list) {
            total += element.doubleValue();
        }
        return total;
    }

    // Lower Bounded Wildcards
    public void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

}
