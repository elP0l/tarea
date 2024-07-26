/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author vecto
 */
public class NotifierBasic implements Notifier {
private String notifierBasicName;
    @Override
    public void sendNotify(String message) {
        //logica para implementar enviar notidicacion
        System.out.println(message);
    }
      public NotifierBasic(String notifierBasicName) {
        this.notifierBasicName = notifierBasicName;
    }
    
    
}
