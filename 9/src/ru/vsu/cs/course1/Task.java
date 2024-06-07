package ru.vsu.cs.course1;


import java.util.List;

public class Task {

    public static void reverseRows(int[][] arr2) {
        for (int r = 0; r < arr2.length / 2; r++) {
            int[] temp = arr2[r];
            arr2[r] = arr2[arr2.length - r - 1];
            arr2[arr2.length - r - 1] = temp;
        }
    }

    public static void reverseColumns(int[][] arr2) {
        int colsCount = arr2[0].length;
        for (int c = 0; c < colsCount / 2; c++) {
            swapColumns(arr2,  c, colsCount - c - 1);
        }
    }

    public static void swapColumns(int[][] arr2, int c1, int c2) {
        for (int[] row : arr2) {
            int temp = row[c1];
            row[c1] = row[c2];
            row[c2] = temp;
        }
    }

    public static void process(List<Integer> list){
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > 0) {
                int minn = list.get(i);
                int indexMin = i;
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j) > 0 && list.get(j) < minn) {
                        minn = list.get(j);
                        indexMin = j;
                    }
                }
                int temporary = list.get(i);
                list.set(i, minn);
                list.set(indexMin, temporary);
            }
        }
    }
}
