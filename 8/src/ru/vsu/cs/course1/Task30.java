package ru.vsu.cs.course1;

public class Task30 {
    public static void diagonalsCount(int[][] arr) {
        int arr1[][] = new int[arr.length][arr[0].length];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr1[r][c] = counter(arr,r,c);
            }
        }
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                arr[i][j] = arr1[i][j];
            }
        }

    }

    public static int counter(int[][] arr, int r, int c) {
        int r1 = r;
        int c1 = c;
        int x = arr[r][c];
        int counter = 1;
        while (r1+1 < arr.length && c1+1 < arr[r].length) {
            if (arr[r1+1][c1+1] == x) {
                counter++;
            }
            r1++;
            c1++;
        }
        r1 = r;
        c1 = c;
        while (r1-1 >= 0 && c1+1 < arr[r].length) {
            if (arr[r1-1][c1+1] == x) {
                counter++;
            }
            r1--;
            c1++;
        }
        r1 = r;
        c1 = c;
        while (r1-1 >= 0 && c1-1 >= 0) {
            if (arr[r1-1][c1-1] == x) {
                counter++;
            }
            r1--;
            c1--;
        }
        r1 = r;
        c1 = c;
        while (r1+1 < arr.length && c1-1 >= 0) {
            if (arr[r1+1][c1-1] == x) {
                counter++;
            }
            r1++;
            c1--;
        }
        return counter;
    }
}
