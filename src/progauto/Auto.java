/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progauto;

/**
 *
 * @author gigga
 */
/*
Definisci una classe Auto per rappresentare oggetti Automobile con il
nome della marca, il nome del modello, la targa e l'anno di 
immatricolazione e con opportuni metodi d'istanza tra cui
un metodo stampa() per la sua descrizione sullo schermo.
Quindi definisci le classi Automezzo e Camion,
indicando la corretta gerarchia e riscrivendo opportunamente i metodi.*/
public class Auto {
    protected String marca;
    protected String modello;
    protected String targa;
    protected int anno;
    
    Auto(String marca, String modello, String targa, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.anno = anno;   
    }
    
    public void stampa() {
        System.out.println("Marca auto: " + marca);
        System.out.println("Modello auto: " + modello);
        System.out.println("Targa auto: " + targa);
        System.out.println("Anno auto: " + anno);
    }
}
