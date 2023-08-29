/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio18cap3;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Ejercicio18cap3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        double retencion_fuente, valor_hora, salario_bruto, salario_neto;
        double retencion_valor;
        
        System.out.println("Introduzca el nombre del empleado: ");
        System.out.println("");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca el codigo del empleado: ");
        System.out.println("");
        String codigo = teclado.nextLine();
        
        System.out.println("Ingrese las horas trabajadas en el mes:  ");
        System.out.println(" ");
        int horas_trabajadas = entrada.nextInt();
        System.out.println("Ingrese el valor de las horas:  ");
        System.out.println(" ");
        valor_hora = entrada.nextDouble();
        System.out.println("Ingrese la retencion en la fuente:  ");
        System.out.println(" ");
        retencion_fuente = entrada.nextDouble();
        double retencion = retencion_fuente/100;
        
        salario_bruto = horas_trabajadas * valor_hora;
        retencion_valor = salario_bruto * retencion;
        salario_neto = salario_bruto - retencion_valor;
        
        System.out.println("el empleado codigo: "+codigo+ " de nombre: " +nombre+ " con salario bruto: "+ salario_bruto+ " tiene un salario neto de: "+ salario_neto);
    }
}
