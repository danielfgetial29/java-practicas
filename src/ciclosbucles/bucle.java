package ciclosbucles;

import java.util.Scanner;

public class bucle {
    public static void main(String[] args) {

        //Bucle While
        int number = 1;

        while (true){
            System.out.println(number);

            if (number >= 5){
                break;
            }
            number += 1;
        }
        System.out.println("Bucle terminado...");

        // Validacion para salir de un bucle
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Desea salir del bucle? (Escriba 'Y' para salir)");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("y")){
                break;
            }
            System.out.println("Entonces coninuemos dentro del bucle...");
        }
        System.out.printf("Saliste del bucle, nos vemos en otra ocasion...");
    }
}
