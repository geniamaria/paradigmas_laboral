package Paradigmas.Estrurura_Condicional;
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
    System.out.println("Introduza o valor");
    x=teclado.nextInt();
    

    if(x%2==0){
        System.out.println("Numero par");
    }
    else{
        System.out.println("Numero impar");
    }
    
}
}