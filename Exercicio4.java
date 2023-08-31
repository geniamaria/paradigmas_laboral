package Paradigmas;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0");     

        int numFuncionario; 
         int horasTrab;
        double salario, valor_porhora;
         System.out.println("Introduza o numero do funcionario");
         numFuncionario= teclado.nextInt();

         System.out.println("Introduza  que recebe por hora");
         valor_porhora= teclado.nextDouble();

        System.out.println("Introduza  o numero de horas");
         horasTrab= teclado.nextInt();

         salario= valor_porhora*horasTrab;
          System.out.println("o numero do funcionario e " +numFuncionario+ "e o salario do funcionario e de "+salario+ formatter.format(0));

    }
}
