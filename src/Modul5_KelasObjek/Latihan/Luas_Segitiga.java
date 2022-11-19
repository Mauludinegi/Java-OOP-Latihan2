/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_KelasObjek.Latihan;

import javax.swing.JOptionPane;

/**
 *
 * @author GIE
 */
class Segitiga {
    String alas, tinggi;
    public void input() {
        alas = JOptionPane.showInputDialog("Masukan Alas");
        tinggi = JOptionPane.showInputDialog("Masukan Tinggi");
        hitung();
    }
    
    public double hitung() {
        long a = Long.parseLong(alas);
        long t = Long.parseLong(tinggi);
        return (0.5 * a * t);
    }
    
    
    public void hasil() {
       JOptionPane.showMessageDialog(null,"0.5 x " + alas + " x " + tinggi + " = " + hitung());
    }
    
}


public class Luas_Segitiga {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Segitiga segitiga = new Segitiga();
        segitiga.input();
        segitiga.hitung();
        segitiga.hasil();
    }
    
}
