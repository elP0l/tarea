/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import java.util.Map;

/**
 *
 * @author vecto
 */
public class TiendaFacade {
    private Canal transaccion;
    private Map<String,Canal> enlaces;
    
    public void usarCanal(String canal) {
        transaccion = enlaces.get(canal);
    }
    
}
