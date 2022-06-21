/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polling;

/**
 *
 * @author ce.christian
 */
public class Polling {
    
    private static final int counter = 0;
    
    public static void main(String[] args) throws InrerruptedException {
    
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                CheckResult.counter++;
            }
        }).start();
        
        while (CheckResult.counter < 400) {
            System.out.println("Esperando...");
            Thread.sleep(1);
        } 
        System.out.println("Terminado");
    }
}
