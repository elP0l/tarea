/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author vecto
 */
public class WireDecorator extends NotifierDecorator{
    
    public WireDecorator(Notifier notifier) {
        super(notifier);
    }
     @Override
    public void sendNotify(String message) {
        super.sendNotify(message);
        //logica para enviar la notificacion al mensaje de Wire
    }
    
}
