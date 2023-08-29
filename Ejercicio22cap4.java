/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio22cap4;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Ejercicio22cap4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner lector = new Scanner(System.in);
        double salario_hora, salario_mes;
        int horas_mes;
        
        System.out.print("Ingrese el nombre del empleado: ");
        System.out.print(" ");
        String nombre = lector.nextLine();
        System.out.print("Ingrese su salario basico por hora: ");
        System.out.print(" ");
        salario_hora = entrada.nextDouble();
        System.out.print("Ingrese el total de horas laboradas en el mes: ");
        System.out.print(" ");
        horas_mes = entrada.nextInt();
        
        salario_mes = (salario_hora * horas_mes);
        
        if (salario_mes > 450000) {
            System.out.println("A "+nombre+" le corresponde un salario de: $"+salario_mes);
        }
        else {
            System.out.println(nombre);
        }
    }
}
