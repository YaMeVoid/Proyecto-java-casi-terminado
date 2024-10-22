/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_java;
 import java.util.ArrayList;
/**
 *
 * @author chett
 */
public class Compra {
      private ArrayList<Medicamento> medicamentosComprados;

    public Compra() {
        medicamentosComprados = new ArrayList<>();
    }

    public void agregarMedicamento(Medicamento medicamento, int cantidad) {
        if (cantidad <= medicamento.getCantidad()) {
            medicamento.setCantidad(medicamento.getCantidad() - cantidad);
            Medicamento comprado = new Medicamento(medicamento.getNombre(), medicamento.getPrecio(), cantidad);
            medicamentosComprados.add(comprado);
        } else {
            System.out.println("Cantidad no disponible en inventario.");
        }
    }

    public double calcularTotal() {
    double total = 0;
        for (Medicamento m : medicamentosComprados) {
            total += m.getPrecio() * m.getCantidad();
        }
        return total;
    }

    public void mostrarCompra() {
        for (Medicamento m : medicamentosComprados) {
            System.out.println(m);
        }
        System.out.println("Total a pagar: " + calcularTotal());
    }
}
