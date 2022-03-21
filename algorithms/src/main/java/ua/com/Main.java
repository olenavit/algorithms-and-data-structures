package ua.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i]= sc.nextInt();
        }
        int a = sc.nextInt();
        System.out.println( binarySearch.search(a,mas));
    }
}
