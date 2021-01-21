package ejercicios;


import java.util.Scanner;

public class NumerosPares {


    public static void main(String [] args){
        //Generando un Scanner para leer Input
        Scanner scanner = new Scanner(System.in);
        //mensaje previo a capturar el input
        System.out.println("Ingrese número entero");
        //capturo el input
        int numero = scanner.nextInt();
        //scaner close?
        scanner.close();
        //paso el como parametro el valor
        for (int i = 1; i <= numero; i++) {
            System.out.println(i*2);
        }

    }
}



