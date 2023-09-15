package Paradigmas.Estrurura_Condicional;

import java.util.Scanner;




public class intervalo {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int val;


        System.out.println("Insira o valor: ");
        val = s.nextInt();

        if (val >= 75 && val <= 100){
            System.out.println("O valor esta entre (75,100)");
        } else {
            if (val >= 50 && val <= 75){
                System.out.println("Valor esta entre 50 e 75");
        } else
            if (val >= 25 && val <= 50){
            System.out.println("Valor esta entre 25 e 50");
        }
        else {
            if (val >= 0 && val <= 25) {
                    System.out.println("O valor esta entre 0 e 25");
                } else {
                    System.out.println("O valor nao se encotra em nenhum dos intervalos");
                }

            }
        }
    }
}