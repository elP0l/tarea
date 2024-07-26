/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author José Marin
 */
public class AfiliacionBasica extends Afiliacion{
    
    @Override
    public TarjetaDeCredito crearTarjetaDeCredito(){
        System.out.println("Creando tarjeta...");
        return new Basica();
    }
    
}
