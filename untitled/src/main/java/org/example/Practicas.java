package org.example;

import java.util.Scanner;

public class Practicas {

    public void practica_3(){

        Scanner entrada = new Scanner(System.in);

        int edad = 0;
        int edad_voto = 18;
        boolean edad_neg = true;

        System.out.println("Introduce tu nombre: ");
        String nombre = entrada.next();

        System.out.println("");
        System.out.println("Hola " + nombre + ". Introduce tu edad: ");

        while(edad_neg==true) {

            edad = entrada.nextInt();

            if (edad >= edad_voto) {

                edad_neg = false;
                System.out.println("Enhorabuena " + nombre + ". Puedes votar.");

            } else if (edad < 0) {

                System.out.println("Introduce de nuevo tu edad: ");

            } else {

                edad_neg = false;
                System.out.println("");
                System.out.println("Lo siento " + nombre + ". No puedes votar.");
                System.out.println("Te faltan " + (edad_voto - edad) + " años para ser mayor de edad.");

            }
        }
    }

    public void practica_4(){

        Scanner entrada = new Scanner(System.in);

        int num_1 = 0;
        int num_2 = 0;

        System.out.println("Introduce el multiplicando (3 cifras): ");
        num_1 = entrada.nextInt();
        System.out.println("Introduce el multiplicador (3 cifras): ");
        num_2 = entrada.nextInt();

        System.out.println("");
        System.out.println("El producto de la multiplicación es: " + (num_1*num_2));
        System.out.println("El proceso es: ");
        System.out.println("   " + num_1);
        System.out.println(" x " + num_2);
        System.out.println("-------");
        String multi = Integer.toString(num_2);
        String dig1 = multi.substring(0,1);
        int dig_1 = Integer.parseInt(dig1);
        String dig2 = multi.substring(1,2);
        int dig_2 = Integer.parseInt(dig2);
        String dig3 = multi.substring(2,3);
        int dig_3 = Integer.parseInt(dig3);
        System.out.println("   " + (num_1*dig_3));
        System.out.println(" " + (num_1*dig_2) + "x");
        System.out.println("" + (num_1*dig_1) + "xx");
        System.out.println("-------");
        System.out.println(num_1*num_2);

    }

}
