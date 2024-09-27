package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    public void control_excepciones(){

       Scanner entrada = new Scanner(System.in);

       int num;
       boolean error = true;

       while (error==true){

           try{

               System.out.println("Introduce un número...");
               num = entrada.nextInt();
               error = false;

           } catch (InputMismatchException er){

               System.out.println("ERROR. Introduce un número válido...");
               entrada.nextLine();

           }

       }

    }
    
}
