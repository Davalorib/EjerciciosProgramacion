package org.example;

import java.util.Scanner;

public class Bocata {

    public void Bocata_ejercicio() {

        System.out.println("");
        System.out.println("A ver si podemos hacer una medio calculadora muy pocha.");
        System.out.println("Vas a darme 2 números y elegir la operación que quieras.");
        System.out.println("");

        int numelec = 0;
        int num1 = 0;
        int num2 = 0;

        System.out.println("Elige la operación que deseas: ");
        System.out.println("1-Sumar      2-Restar       3-Multiplicar       4-Dividir");
        System.out.println("");
        Scanner elec = new Scanner(System.in);
        numelec = elec.nextInt();
        System.out.println("");

        if (numelec==1){
            System.out.println("Has elegido sumar");

            System.out.println("Introduce el primer número");
            num1 = elec.nextInt();
            System.out.println("Introduce el segundo número");
            num2 = elec.nextInt();

            int resultado = num1 + num2;
            System.out.println("");
            System.out.println("El resultado de la suma es " + resultado);

        }

        if (numelec==2){
            System.out.println("Has elegido restar");

            System.out.println("Introduce el primer número");
            num1 = elec.nextInt();
            System.out.println("Introduce el segundo número");
            num2 = elec.nextInt();

            int resultado = num1 - num2;
            System.out.println("");
            System.out.println("El resultado de la resta es " + resultado);

        }

        if (numelec==3){
            System.out.println("Has elegido multiplicar");

            System.out.println("Introduce el primer número");
            num1 = elec.nextInt();
            System.out.println("Introduce el segundo número");
            num2 = elec.nextInt();

            int resultado = num1 * num2;
            System.out.println("");
            System.out.println("El resultado de la multiplicación es " + resultado);

        }

        if (numelec==4){
            System.out.println("Has elegido dividir");

            System.out.println("Introduce el primer número");
            num1 = elec.nextInt();
            System.out.println("Introduce el segundo número");
            num2 = elec.nextInt();

            int resultado = num1 / num2;
            System.out.println("");
            System.out.println("El resultado de la división es " + resultado);

        }


    }
}
