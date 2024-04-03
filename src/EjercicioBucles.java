// Ejercicio bucle para validar contraseña
// Bucle determinado: for y for each(para recorrer arrays)
// Bucles indeterminados: while y do while

import java.util.Scanner;

public class EjercicioBucles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su contraseña");

        String pass = sc.nextLine();

        while (!pass.equals("1234")){
            System.out.println("Su contraseña es incorrecta, intentelo de nuevo");
            pass = sc.nextLine();
        }

        System.out.println("Contraseña correcta, Bienvenido Roy Rodriguez");
    }
}
