package Paradigmas.Estrurura_Condicional;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a , b;
        float div;

        System.out.println("Insira o primeiro  valor: ");
        a = s.nextInt();

        System.out.println("Insira o segundo valor: ");
        b = s.nextInt();

        if (a > b){
            div = a/b;
          if (div == 0){
              System.out.println("Sao Multiplos");
          }
          else{
              System.out.println("Nao sao Multiplos");
          }
        }
        }
    }



