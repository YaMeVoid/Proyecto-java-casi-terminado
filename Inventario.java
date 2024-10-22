/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_java;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author chett
 */
public class Inventario {
    private ArrayList<Medicamento> medicamentos;
    public Inventario() {
        medicamentos = new ArrayList<>();
    }
     public void agregarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }
     public void eliminarMedicamento(String nombre) {
        medicamentos.removeIf(m -> m.getNombre().equalsIgnoreCase(nombre));
    }
        public void modificarMedicamento(String nombre, int nuevaCantidad) {
        for (Medicamento m : medicamentos) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                m.setCantidad(nuevaCantidad);
                break;
            }
        }
    }
        public void mostrarInventario() {
        for (Medicamento m : medicamentos) {
            System.out.println(m);
        }
    }
        public Medicamento buscarMedicamento(String nombre) {
        for (int i =  0; i<medicamentos.size(); i++) {
            if (medicamentos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return medicamentos.get(i);
            }
        }
        return null;
    }

      
}
