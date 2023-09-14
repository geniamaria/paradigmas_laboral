package Paradigmas.Estrutura_Sequencial;
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {

            Scanner a = new Scanner(System.in);

        double pi = 3.14159, raio , area;
        System.out.println("Digite a area  do circulo: ");

         raio = a.nextDouble();

         area = pi * Math.pow(raio, 2);

        System.out.printf("A area do circulo e: %.4f%n", area);

        a.close();
    }
}
