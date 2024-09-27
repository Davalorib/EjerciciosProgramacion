package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bateria {

    public void bateria_ej1(){

        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int error = 0;

        while(error==0) {
            try {
                System.out.println("Introduce un número");
                num1 = entrada.nextInt();

                if (num1 > 0) {
                    System.out.println("");
                    System.out.println("El número " + num1 + " es mayor que 0.");
                    error = 1;

                } else if (num1 < 0) {
                    System.out.println("");
                    System.out.println("El número " + num1 + " es menor que 0.");
                    error = 1;

                } else {
                    System.out.println("");
                    System.out.println("El número " + num1 + " es un número natural");
                    error = 1;
                }

            } catch (InputMismatchException er) {

                System.out.println("ERROR. Introduce un número válido...");
                entrada.nextLine();

            }
        }

    }

    public void bateria_ej2(){

        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;




    }

}
