import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num;
        int contador = 0;
        double sumaTotal = 0;

        do {
            System.out.println("Ingresa tu numero, si deseas salir coloca un numero negativo");

            num = sc.nextDouble();

            if (num >= 0){
                contador++;
                sumaTotal += num;
            }

        }while (num>=0);

        System.out.println("haz introducido " + contador + " numeros. Su media sería " + sumaTotal/contador);
    }
}
