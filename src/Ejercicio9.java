//Aplicación de piedra, papel y tijera

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Que opción elegiras: \n" +
                "piedra, papel o tijera");

        String eleccion = sc.nextLine();

        int num = (int) ((Math.random()*5) + 1);

        String eleccionVS;

        switch (num){
            case 1:
                eleccionVS = "piedra";
                break;
            case 2:
                eleccionVS = "papel";
                break;
            default:
                eleccionVS = "tijera";
                break;
        }

        if (eleccion.equals("piedra") && eleccionVS.equals("papel")){
            System.out.println("Haz ganado. La piedra chanca al " + eleccionVS);
        } else if (eleccion.equals("piedra") && eleccionVS.equals("tijera")) {
            System.out.println("Haz ganado. La piedra destruye a la " + eleccionVS);
        }else if (eleccion.equals("papel") && eleccionVS.equals("piedra")) {
            System.out.println("Haz ganado. El papel tapa a la " + eleccionVS);
        }else if (eleccion.equals("tijera") && eleccionVS.equals("papel")) {
            System.out.println("Haz ganado. La tijera corta al " + eleccionVS);
        } else if (eleccion.equalsIgnoreCase(eleccionVS)) {
            System.out.println("Han empatado. ¡A jugar otra vez!");
        } else {
            System.out.println("Haz perdido. Tu elegiste " + eleccion + " mientras que tu contrincante eligio " +
                            eleccionVS);
        }
    }
}
