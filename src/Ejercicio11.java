import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a dibujar \nIntroduce la altura");

        int altura = sc.nextInt();

        System.out.println("Ahora introduce el ancho");

        int ancho = sc.nextInt();

        for (int i=0; i<altura ; i++) {
            for (int j=0; j<ancho ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
