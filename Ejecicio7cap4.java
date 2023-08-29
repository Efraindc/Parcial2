/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejecicio7cap4;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Ejecicio7cap4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B;
        System.out.println("Ingrese el valor de A:  ");
        A = entrada.nextDouble();
        System.out.println("Ingrese el valor de B:  ");
        B = entrada.nextDouble();
        
        if (A>B){
            System.out.println("A es mayor que B");
        }
        else if (B>A){
            System.out.println("A es menor que B");
        }
        else if (A == B){
            System.out.println("A es igual a B");
        }
        {
        }
    }
}
