package condicionales;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite un numero entero: ");
        int num = Integer.valueOf(scanner.nextLine());

        int multiplicado = num * num;

        System.out.println(multiplicado);
        scanner.close();

    }
}
