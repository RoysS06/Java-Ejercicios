import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero que desees evaluar");
        int num1 = sc.nextInt();

        if(num1 > 1000 || num1 < 0){
            System.out.println("Introduce un numero valido");
            System.exit(0);
        }

        if(num1 % 2 == 0){
            System.out.println("El numero " + num1 + " es par");
        } else {
            System.out.println("El numero " + num1 + " No es par");
        }

        if (num1 % 5 == 0){
            System.out.println("el numero " + num1 + " es divisible entre 5");
        }else {
            System.out.println("el numero " + num1 + " no es divisible entre 5");
        }

    }
}
