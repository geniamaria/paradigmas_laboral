package Paradigmas.Estrutura_Sequencial;

import java.util.Scanner;

public class diferencaProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, dif;

        System.out.println("Introduza quatro valores Inteiros A, B, C e D: ");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        dif = ((a * b) - (c * d));

        System.out.println("a diferença do produto de A e B pelo produto de C e D e : " + dif);
    }
}
