package Paradigmas.Estrurura_Condicional;
import java.util.Scanner;
public class negativoPositivo {
    public static void main(String[] args) {
        int x;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduza o valor");
    x=teclado.nextInt();
    if(x<0){
        System.out.println(" o numero e negativo");
    }
    else{
        System.out.println( " o numero nao e negativo");
    }
    
}
}
