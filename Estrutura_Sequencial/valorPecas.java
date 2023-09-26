package Paradigmas.Estrutura_Sequencial;

import java.util.Scanner;

public class valorPecas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double valPc1, valPc2, valTotal1,valTotal2, Total;
        int codPc1, codPc2;
        int nrPc1, nrPc2;

        System.out.println("Introduza o codigo da peca 1: ");
        codPc1 = sc.nextInt();

        System.out.println("Introduca a quantidade de pecas " + codPc1 + ": ");
        nrPc1 = sc.nextInt();

        System.out.println("Indique o valor unitario da peca " + codPc1 + ": ");
        valPc1 = sc.nextDouble();

        valTotal1 = valPc1 * nrPc1;

        System.out.println("---------------------------------------------------------------");

        System.out.println("Introduza o codigo da peca 2: ");
        codPc2 = sc.nextInt();

        System.out.println("Introduca a quantidade de pecas " + codPc2 + ": ");
        nrPc2 = sc.nextInt();

        System.out.println("Indique o valor unitario da peca " + codPc2 + ": ");
        valPc2 = sc.nextDouble();

        valTotal2 = valPc2 * nrPc2;

        Total = valTotal1 + valTotal2;

        System.out.println("O valor total a pagar e: " + Total);
    }
}
