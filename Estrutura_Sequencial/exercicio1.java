package Paradigmas.Estrutura_Sequencial;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x1;
        int x2;
        int soma;
        System.out.println("Introduza o primeiro valor");
        x1=teclado.nextInt();
         System.out.println("Introduza o segundo valor");
          x2=teclado.nextInt();
          soma = x1+ x2;
          System.out.println(" A soma dos valores introduzidos e de " +soma);

    }
}
