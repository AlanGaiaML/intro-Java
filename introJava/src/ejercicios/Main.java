package ejercicios;


import java.util.Scanner;

public class Main {

    public static void numerosPares(){
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

    public static void multiplo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de multiplos");
        int cantidadMultiplos = scanner.nextInt();

        System.out.println("Ingrese el numero base");
        int numBase = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= cantidadMultiplos ; i++) {
            System.out.println(numBase * i);
        }

    }

    public static boolean esPrimo(int num) {
        boolean resultado = true;
        int contador = 2;

        while ((resultado) && contador != num){
            if (num % contador == 0){
                resultado = false;
                System.out.println(resultado);
                return resultado;
            }
            contador++;
        }
        System.out.println(resultado);
        return  resultado;

    }

    public static void main(String [] args){
        //Ejercicio 1:
       //numerosPares();

       // Ejercicio 2
       // multiplo();
        // Ejercicio 3
        //esPrimo(4);
    }


}
