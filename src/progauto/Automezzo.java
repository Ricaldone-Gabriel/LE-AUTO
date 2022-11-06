/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progauto;

/**
 *
 * @author gigga
 */
public class Automezzo extends Auto{
    Automezzo(String marca, String modello, String targa, int anno) {
        super(marca,modello,targa,anno);
    }
    
    @Override
    public void stampa() {
        System.out.println("Marca automezzo (auto): " + marca);
        System.out.println("Modello automezzo (auto): " + modello);
        System.out.println("Targa automezzo (auto): " + targa);
        System.out.println("Anno automezzo (auto): " + anno);
    }
}
