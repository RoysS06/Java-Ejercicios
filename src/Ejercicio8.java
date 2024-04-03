//Aplicación para calcular entradas de cine

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Cuantas entradas deseas comprar");
        int nEntradas = sc.nextInt();
        sc.nextLine();

        System.out.println("¿Que día deseas ir?");
        String dia = sc.nextLine();

        System.out.println("¿Tienes tarjeta de socio? (S/N)");
        String tarjeta = sc.nextLine();

        double precioTotal;

        switch (dia.toLowerCase()){
            case "miercoles":
                precioTotal = nEntradas*5;
                break;
            case "jueves":
                if (nEntradas%2 == 0){
                    precioTotal = (nEntradas/2)*11;
                }else{
                    precioTotal = (nEntradas/2)*11;
                    precioTotal+=8;
                }
                break;
            default:
                precioTotal = nEntradas*8;
        }

        if (tarjeta.equalsIgnoreCase("S")){
            precioTotal -= (precioTotal*0.10);
        }

        System.out.println("Haz comprado un total de: " + nEntradas + " entradas. Tienes que pagar un total de: "
                + precioTotal + " nuevos soles. ¡Disfruta tu pelicula!");

    }
}
