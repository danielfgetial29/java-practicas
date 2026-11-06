package ciclosbucles;

import java.util.Scanner;

public class bucle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Bucle While
//        int number = 1;
//
//        while (true){
//            System.out.println(number);
//
//            if (number >= 5){
//                break;
//            }
//            number += 1;
//        }
//        System.out.println("Bucle terminado...");

        // Validacion para salir de un bucle
//        Scanner scanner = new Scanner(System.in);

//        while (true){
//            System.out.println("Desea salir del bucle? (Escriba 'Y' para salir)");
//            String respuesta = scanner.nextLine();
//
//            if (respuesta.equalsIgnoreCase("y")){
//                break;
//            }
//            System.out.println("Entonces coninuemos dentro del bucle...");
//        }
//        System.out.printf("Saliste del bucle, nos vemos en otra ocasion...");

        //Continuar (no = salir)

//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            System.out.println("Continuamos?");
//            String respuesta = scanner.nextLine();
//
//            if (respuesta.equalsIgnoreCase("no")){
//                break;
//            }
//        }
//
//        while (true){
//            System.out.println("Ingrese un numero");
//            int numero = Integer.valueOf(scanner.nextLine());
//
//            if (numero == 4){
//                break;
//            }
//        }

        // continue
        //Scanner scanner = new Scanner(System.in);

//        while (true) {
//            System.out.println("Ingresa un entero positivo");
//            int number1 = Integer.valueOf(scanner.nextLine());
//
//
//            if (number1 == 0) {
//                break;
//            }
//
//           if (number1 <= 0) {
//               System.out.println("Numero invalido. Trata de nuevo");
//               continue;
//            }
//
//            System.out.println("Tu numero fue " + number1);
//            System.out.println();
//        }

//        int numero2 = 0;
//        while (true){
//            numero2 += 1;
//
//            if (numero2 >= 5){
//                break;
//            }
//            if (numero2 < 5){
//                continue;
//            }
//            System.out.println(numero2 + " ");
//        }
//        System.out.println(numero2 + " ");

//        while (true){
//            System.out.println("Ingrese un entero positivo: ");
//            int num = Integer.valueOf(scanner.nextLine());
//
//            if (num == 0) {
//                break;
//            }
//
//            if (num < 0) {
//                System.out.println("Numero invalido");
//                continue;
//            }
//
//            System.out.println(num * num);
//        }

        // Contar intentos ingresados
        int contador = 0;

//        while (true){
//            System.out.println("Ingrerse un numero por favor:");
//            int num = Integer.valueOf(scanner.nextLine());
//
//            if(num == 0){
//                break;
//            }
//            if (num != 0){
//                contador += 1;
//            }
//        }
//        System.out.println("Numero de numeros ingresados: "+ contador);

        // Contar numeros negativos
        while (true){
            System.out.println("Ingrerse un numero por favor:");
            int num = Integer.valueOf(scanner.nextLine());

            if(num == 0){
                break;
            }
            if (num < 0){
                contador += 1;
            }
        }
        System.out.println("Numero de numeros negativos: "+ contador);
        scanner.close();

        scanner.close();
    }
}
