package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practicas {

    public void practica_3() {

        Scanner entrada = new Scanner(System.in);

        int edad = 0;
        int edad_voto = 18;
        boolean edad_neg = true;

        System.out.println("Introduce tu nombre: ");
        String nombre = entrada.next();

        System.out.println("");
        System.out.println("Hola " + nombre + ". Introduce tu edad: ");

        while (edad_neg == true) {
            try {

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

            } catch (InputMismatchException er) {
                System.out.println("ERROR. Introduce un valor válido...");
                entrada.nextLine();
            }
        }
    }

    public void practica_4() {

        Scanner entrada = new Scanner(System.in);

        int num_1 = 0;
        int num_2 = 0;
        boolean rep = true;
        boolean rep1 = true;
        boolean rep2 = true;

        while (rep == true) {

            try {
                System.out.println("Introduce el multiplicando (3 cifras): ");

                while(rep1 == true) { //repeticion para que sean numeros de 3 cifras
                num_1 = entrada.nextInt(); //metemos 1er numero

                    if (num_1 > 99 & num_1 < 1000) { //si es de 3 cifras positivo paramos el while
                        rep1 = false;
                        System.out.println("Introduce el multiplicador (3 cifras): ");

                    }else if (num_1 < -99 & num_1 > -1000) { //si es de 3 cifras negativo paramos el while
                        rep1 = false;
                        System.out.println("Introduce el multiplicador (3 cifras): ");

                    }else { //lo contrario repetimos while
                        System.out.println("ERROR. Introduce un valor de 3 cifras: ");
                        entrada.nextLine();
                        System.out.println("");
                    }
                }

                while(rep2==true) { //repeticion para que sean numeros de 3 cifras

                    num_2 = entrada.nextInt(); //pedimos el 2º numero
                    if (num_2 > 99 & num_2 < 1000) { //si es de 3 cifras
                        rep = false;
                        rep2 = false;

                        System.out.println("");
                        System.out.println("El producto de la multiplicación es: " + (num_1 * num_2));
                        System.out.println("El proceso es: ");
                        System.out.println("   " + num_1);
                        System.out.println(" x " + num_2);
                        System.out.println("-------");

                        String multi = Integer.toString(num_2); //para ir cogiendo valores convertimos a string el numero
                        String dig1 = multi.substring(0, 1); //cogemos ese valor del string
                        int dig_1 = Integer.parseInt(dig1); //convertimos el valor a int
                        String dig2 = multi.substring(1, 2);
                        int dig_2 = Integer.parseInt(dig2);
                        String dig3 = multi.substring(2, 3);
                        int dig_3 = Integer.parseInt(dig3);


                        System.out.println("   " + (num_1 * dig_3));
                        System.out.println(" " + (num_1 * dig_2) + "x");
                        System.out.println("" + (num_1 * dig_1) + "xx");
                        System.out.println("-------");
                        System.out.println(num_1 * num_2);

                    }else if (num_2 < -99 & num_2 > -1000){ //lo mismo para los negativos

                        rep = false;
                        rep2 = false;

                        System.out.println("");
                        System.out.println("El producto de la multiplicación es: " + (num_1 * num_2));
                        System.out.println("El proceso es: ");
                        System.out.println("    " + num_1);
                        System.out.println(" x " + num_2);
                        System.out.println("-------");

                        String multi = Integer.toString(num_2); //lo mismo de antes arreglandolo para que no coja el signo negativo
                        String dig1 = multi.substring(1, 2);
                        int dig_1 = Integer.parseInt(dig1);
                        String dig2 = multi.substring(2, 3);
                        int dig_2 = Integer.parseInt(dig2);
                        String dig3 = multi.substring(3, 4);
                        int dig_3 = Integer.parseInt(dig3);


                        System.out.println("    " + (num_1 * dig_3));
                        System.out.println("  " + (num_1 * dig_2) + "x");
                        System.out.println(" " + (num_1 * dig_1) + "xx");
                        System.out.println("-------");
                        System.out.println(num_1 * num_2);

                    } else{ //lo demas repetimos el while

                        System.out.println("");
                        System.out.println("ERROR. Introduce un valor de 3 cifras: ");
                        entrada.nextLine();

                    }
                }

            } catch (InputMismatchException er) { //el catch para no poner letras
                System.out.println("ERROR. Introduce un valor válido...");
                entrada.nextLine();
            }
        }
    }
}