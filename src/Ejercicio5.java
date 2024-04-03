import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera nota");
        double nota1 = sc.nextDouble();

        System.out.println("Introduce la segunda nota");
        double nota2 = sc.nextDouble();

        System.out.println("Introduce la tercera nota");
        double nota3 = sc.nextDouble();

        double notaMedia = (nota1 + nota2 + nota3) / 3;

        if(notaMedia <= 10){
            System.out.println("Haz desaprobado. Tienes una media de: " + notaMedia);
        } else if (notaMedia <= 15){
            System.out.println("Pasaste a las justas. Tienes una media de: " + notaMedia);
        } else if (notaMedia <= 19) {
            System.out.println("Excelente, casi perfecto. Tienes una media de: " + notaMedia);
        }else if(notaMedia == 20){
            System.out.println("Pasaste con honores, ¡MUY BIEN!. Tienes una media de: " + notaMedia);
        } else {
            System.out.println("Ingresa notas validas");
        }
    }
}
