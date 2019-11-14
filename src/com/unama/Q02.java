package com.unama;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor[] = new int[10];
        int maior = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valor[i] = sc.nextInt();
            if (valor[i] > maior) {
            }
        }
        System.out.println("Maior valor = "+ maior);
    }
}