/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author José Marin
 */
public class Basica implements TarjetaDeCredito{

    @Override
    public float calcularCosto() {
        System.out.println("Calculando costo...");
        return 120;
    }

    @Override
    public float obtenerLimiteCredito() {
        System.out.println("Obteniendo limite de credito...");
        return 1000;
    }
    
}
