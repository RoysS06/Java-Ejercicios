import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, numIntro, intentos;

        num = (int) Math.round((Math.random()*99)+1);

        intentos = 0;

        System.out.println("Ingresa un numero entre el 1 y 100. Recuerda: solo tiene 10 intentos para encontarlo");

        do {
            System.out.println("Ingresa un numero");

            numIntro = sc.nextInt();
            if (numIntro < num) System.out.println("Te falta");
            if (numIntro > num) System.out.println("te pasaste");

            intentos++;

        }while (numIntro != num && intentos < 10);

        if (numIntro != num){
            System.out.println("Perdiste, el numero que debias encontrar era: " + num);
        }else {
            System.out.println("Ganasta y en " + intentos + " intentos");
        }
    }

}
