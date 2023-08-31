import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int a , b, c, d;
        int dif;

           System.out.println("Insira o primeiro  valor: ");
           a = s.nextInt();

        System.out.println("Insira o Segundo  valor: ");
        b = s.nextInt();

        System.out.println("Insira o terceiro  valor: ");
        c = s.nextInt();

        System.out.println("Insira o quarto  valor: ");
        d = s.nextInt();

         dif = ((a*b)-(c*d));

        System.out.println("A diferenca do produto A e B pelo producto C e D e: " + dif);
    }
}