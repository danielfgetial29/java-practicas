package condicionales;

import java.util.Scanner;

public class ConditionalsExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        System.out.println("Ingrese su edad: ");
        int edad = Integer.valueOf(scanner.nextLine());

        if (edad >= 18){
            System.out.println("Tienes permiso de votar");
        }else
            System.out.println("No puedes votar");


        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        System.out.println("Ingresa un numero: ");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingresa el segundo numero: ");
        int num2 = Integer.valueOf(scanner.nextLine());

        if (num1 > num2){
            System.out.printf("%d es mayor que %d", num1, num2);
        } else if (num1 < num2) {
            System.out.printf("%d es mayor que %d", num2, num1);
        }else
            System.out.println("Los numeros son iguales");

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        int dato = 5;
        if (dato > 0){
            System.out.println("El numero es positivo");
        }else
            System.out.println("El numero es negativo");

        // 4. Crea un programa que diga si un número es par o impar.

        int data = 9;

        if (data % 2 == 0){
            System.out.println("Numero es par");
        }else
            System.out.println("Numero es impar");

        // 5. Verifica si un número está en el rango de 1 a 100.

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

    }
}
