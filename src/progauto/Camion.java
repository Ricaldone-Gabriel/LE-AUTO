/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progauto;

/**
 *
 * @author gigga
 */
public class Camion extends Auto {
    
    Camion(String marca, String modello, String targa, int anno) {
        super(marca,modello,targa,anno);
    }
    
    @Override
    public void stampa() {
        System.out.println("Marca camion (auto): " + marca);
        System.out.println("Modello camion (auto): " + modello);
        System.out.println("Targa camion (auto): " + targa);
        System.out.println("Anno camion (auto): " + anno);
    }
}
