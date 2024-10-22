/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_java;

import java.util.Scanner;

/**
 *
 * @author chett
 */
public class Proyecto_java {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
       Compra compra = new Compra();
        Scanner scanner = new Scanner(System.in);

      
        inventario.agregarMedicamento(new Medicamento("Paracetamol", 20.0, 100));
        inventario.agregarMedicamento(new Medicamento("Ibuprofeno", 15.0, 50));
        inventario.agregarMedicamento(new Medicamento("Aspirina", 10.0, 80));

        System.out.println("Inventario actual:");
        inventario.mostrarInventario();

        // Proceso de compra
        System.out.println("\nSeleccione un medicamento para comprar:");
        String nombre = scanner.nextLine();
        Medicamento seleccionado = inventario.buscarMedicamento(nombre);
        
        if (seleccionado != null) {
            System.out.println("Cantidad a comprar:");
            int cantidad = scanner.nextInt();
          

            System.out.println("Metodo de pago? (efectivo/tarjeta):");
            scanner.nextLine();  // Limpiar buffer
            String metodoPago = scanner.nextLine();

            //Crear la venta y procesarla
          Venta venta = new Venta(compra, metodoPago);
            venta.procesarVenta();
        } else {
            System.out.println("Medicamento no encontrado.");
        }

        scanner.close();
    }
}
