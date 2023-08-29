/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10cap4;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Ejercicio10cap4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner lector = new Scanner(System.in);
        int estrato_social, valor_normal;
        double patrimonio;
        
        System.out.println("Ingrese el numero de inscripcion del estudiante: ");
        String numero_inscripcion = lector.nextLine();
        System.out.println(" ");
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = lector.nextLine();
        System.out.println(" ");
        System.out.println("Ingrese el patrimonio de "+nombre+": ");
        patrimonio = entrada.nextDouble();
        System.out.println(" ");
        System.out.println("Ingrese el estrato de "+nombre+": ");
        estrato_social = entrada.nextInt();
        System.out.println(" ");
        
        valor_normal = 50000;
        
        if ((patrimonio>2000000) && (estrato_social > 3)){
            double adicion = valor_normal + ((patrimonio*3)/100);
            System.out.println("El estudiante con numero de inscripcion: "+numero_inscripcion+", "+"Y nombre: "+nombre+", "+"Debe pagar: $"+adicion);
        }
        else {
            System.out.println("El estudiante con numero de inscripcion: "+numero_inscripcion+", "+"Y nombre: "+nombre+", "+"Debe pagar: $"+valor_normal);
        }
        }
    }
