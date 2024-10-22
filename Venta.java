/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_java;
import  java.util.ArrayList;;
/**
 *
 * @author chett
 */
public class Venta {
     private Compra compra;
    private String metodoPago;

    public Venta(Compra compra, String metodoPago) {
        this.compra = compra;
        this.metodoPago = metodoPago;
    }

    public void procesarVenta() {
        System.out.println("Método de pago: " + metodoPago);
        compra.mostrarCompra();
    }
}
