

import java.util.Scanner;

public class fechas {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        String fecha_nacimiento1;
        String fecha_nacimiento2;

        System.out.println("Ingrese la primera fecha de nacimiento como DD/MM/AAAA");
        fecha_nacimiento1 = sc.nextLine();

        System.out.println("Ingrese la segunda fecha de nacimiento como DD/MM/AAAA");
        fecha_nacimiento2 = sc.nextLine();

        //  Primera fecha ingresada de nacimiento
        int diaNacimiento1 = Integer.parseInt(fecha_nacimiento1.substring(0, 2));
        int mesNacimiento1 = Integer.parseInt(fecha_nacimiento1.substring(3, 5));
        int annioNacimiento1 = Integer.parseInt(fecha_nacimiento1.substring(6, 10));

// Segunda fecha ingresada de nacimiento
        int diaNacimiento2 = Integer.parseInt(fecha_nacimiento2.substring(0, 2));
        int mesNacimiento2 = Integer.parseInt(fecha_nacimiento2.substring(3, 5));
        int annioNacimiento2 = Integer.parseInt(fecha_nacimiento2.substring(6, 10));




//// el programa reconoce las fechas como numero( 1980<1993), porloque al ingresar fechas hay que plantearlo al revez(1980>1993)
//
//
//        if ((annioNacimiento1 > annioNacimiento2) || (annioNacimiento1 == annioNacimiento2 && mesNacimiento1 > mesNacimiento2)
//               || (annioNacimiento1 == annioNacimiento2 && mesNacimiento1 == mesNacimiento2 && diaNacimiento1 > diaNacimiento2)) {
//            System.out.println("La segunda fecha de nacimiento es mayor.");
//         } else if (annioNacimiento1 == annioNacimiento2 && mesNacimiento1 == mesNacimiento2 && diaNacimiento1 == diaNacimiento2) {
//            System.out.println("Las fechas de nacimiento son iguales.");
//        } else {
//            System.out.println("La primera fecha de nacimiento es mayor.");
//        }

// idea de excel, en el cual a cada fecha  se le asigna un numero entero
        int fecha1 = annioNacimiento1 * 10000 + mesNacimiento1 * 100 + diaNacimiento1;
        int fecha2 = annioNacimiento2 * 10000 + mesNacimiento2 * 100 + diaNacimiento2;

        if (fecha1 < fecha2) {
            System.out.println("La primera persona  es mayor.");
        } else if (fecha1 > fecha2) {
            System.out.println("La segunda persona es mayor");
        } else {
            System.out.println("Las fechas de nacimiento son iguales, tienen la misma edad.");
        }



    }

}
