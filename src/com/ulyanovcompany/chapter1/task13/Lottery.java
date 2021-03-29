package com.ulyanovcompany.chapter1.task13;

import java.util.ArrayList;

public class Lottery {

    private static void addArray(ArrayList arrayList) {
        for (int i = 1; i < 50; i++) {
            arrayList.add(i);
        }
    }

    private static int random() {
        return (int) Math.random() * 49 + 1;
    }

    public static int[] lottery() {
        ArrayList<Integer> arrayList = new ArrayList();
        int[] ticket = new int[6];
        addArray(arrayList);
        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random() * 49) + 1;
            ticket[i] = arrayList.get(index);
            arrayList.remove(index);
        }
        return ticket;
    }

}
