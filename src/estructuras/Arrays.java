package estructuras;

public class Arrays {
    public static void main(String[] args) {

        //Declaracion y creacion

        //Arreglo de enteros vacio
        // pero indicando el tamaño que tendra
        int[] numbers = new  int[3];
        System.out.println(numbers);

        //Arreglo de Strings
        String[] nombres = {"Daniel", "Felipe", "Lucero", "Adriana"};
        System.out.println(nombres);

        //Acceso
        System.out.println(numbers[0]);
        System.out.println(nombres[0]);

        System.out.println((new String[3])[0]);

        // Modificación
        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // numbers[3] = 2; Error

        System.out.println(nombres[2]);
        nombres[2] = "mouredev@gmail.com";
        System.out.println(nombres[2]);

        System.out.println(nombres.length);
        nombres[2] = null;
        System.out.println(nombres[2]);
        System.out.println(nombres.length);

        // numbers[2] = null; Error

        boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]);
    }
}
