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

    public void bateria_ej4() {

        Scanner entrada = new Scanner(System.in);

        int base = 0;
        int altura = 0;
        int area = 0;
        boolean base_r = true;
        boolean altura_r = true;

        while(base_r==true){

            try {
                System.out.println("Dame el valor de la base del triángulo");
                base = entrada.nextInt();

                if (base > 0) {

                    base_r = false;
                    while(altura_r==true) {
                        System.out.println("");
                        System.out.println("Dame el valor de la altura del triángulo");
                        altura = entrada.nextInt();

                        if (altura > 0) {
                            altura_r = false;
                            System.out.println("");
                            System.out.println("CALCULANDO ÁREA DEL TRIÁNGULO DADO...");
                            area = (base * altura) / 2;
                            System.out.println("El área del triángulo es: " + area);

                        } else {
                            System.out.println("El valor de la altura tiene que ser positivo...");

                        }
                    }

                } else {
                    System.out.println("El valor de la base tiene que ser positivo...");

                }

            }catch(InputMismatchException er){
                System.out.println("ERROR. Introduce un número válido...");
                entrada.nextLine();
            }
        }
    }
}
