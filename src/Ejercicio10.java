//Tabla de multiplicar usando for

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero que deseas multiplicar");

        int num = sc.nextInt();

        for (int i=1; i<=10 ; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
