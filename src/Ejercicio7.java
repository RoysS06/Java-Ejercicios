// Programa para encontrar el primer y ultimo digito del numero que el usuario coloque ( max: 5 cifras)
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero (Debe ser positivo y tener como maximo 5 cifras");

        int num = sc.nextInt();
        int aux = num;

        //Aplicamos un if en caso el numero no sea valido
        if(num<0 || num>99999){
            System.out.println("Ingresa un numero dentro del rango");
            System.exit(0);
        }

        //Para mostrar el ultimo digito
        System.out.println("La ultima cifra del numero " + num + " es: " + num%10);

        //Para mostrar la primera cifra
        if(num<10){
            System.out.println("La primera cifra del numero " + num + " es: " + num%10);
        }else if(num<100){
            aux/=10;
            System.out.println("la primera cifra del numero " + num + " es: " + aux%10);
        }else if(num<1000){
            aux/=100;
            System.out.println("la primera cifra del numero " + num + " es: " + aux%10);
        } else if (num<10000) {
            aux/=1000;
            System.out.println("la primera cifra del numero " + num + " es: " + aux%10);
        }else{
            aux/=10000;
            System.out.println("la primera cifra del numero " + num + " es: " + aux%10);
        }
    }
}
