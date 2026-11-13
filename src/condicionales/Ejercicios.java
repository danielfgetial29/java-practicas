package condicionales;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Digite un numero entero: ");
//        int num = Integer.valueOf(scanner.nextLine());
//
//        int multiplicado = num * num;
//
//        System.out.println(multiplicado);
//

//        // Raiz cuadrada
//        System.out.println("Ingrese un entero positivo: ");
//        int num = Integer.valueOf(scanner.nextLine());
//
//        System.out.println("Ingrese otro numero entero positivo");
//        int num2 = Integer.valueOf(scanner.nextLine());
//
//        int sumaNumeros = num + num2;
//        double raiz = Math.sqrt(sumaNumeros);
//
//        System.out.println(raiz);

        // valor absoluto
//        System.out.println("Ingrese un numero:");
//        int num = Integer.valueOf(scanner.nextLine());
//
//        if (num < 0){
//            num *= -1;
//            System.out.println(num);
//        }else{
//            System.out.println(num);
//        }

        // Numero mayor o menor
        System.out.println("Ingrese el primer numeero");
        int firts = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingrese el segundo numero");
        int second = Integer.valueOf(scanner.nextLine());

        if (firts > second){
            System.out.printf("%d Es mayor que %d", firts, second);
        } else if (firts < second) {
            System.out.printf("%d Es mayor que %d", second, firts);
        }else {
            System.out.printf("%d Es igual a %d", firts, second);
        }


        scanner.close();

    }
}
