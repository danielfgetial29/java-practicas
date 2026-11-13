package condicionales;

import java.util.Scanner;

public class CondicionalSwitch {
    public static void main(String[] args) {


        // Switch

        var day = 2;

        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("No es lunes ni martes ni miercoles");
        }

        int option = 4;

        String respuesta = switch (option){
            case 1 -> "Eligio la opcion 1";
            case 2 -> "Eligio la opcion 2";
            case 4 -> "Eligio la opcion 4";
            default -> "No eligio ni la opcion 1,2,4";
        };

        System.out.println(respuesta);


    }
}
