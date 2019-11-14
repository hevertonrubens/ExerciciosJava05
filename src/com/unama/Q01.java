package com.unama;

import java.util.Scanner;

import static java.lang.System.out;

public class Q01 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int n = 10;
        int v[] = new int[n];
        int i;
        for (i=0; i<n; i++) {
            System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
            v[i] = sc.nextInt();
    }
    }

}
