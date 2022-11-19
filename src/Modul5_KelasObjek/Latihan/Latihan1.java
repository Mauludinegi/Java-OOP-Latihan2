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
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = JOptionPane.showInputDialog("Masukan Angka Pertama");
        int a = Integer.valueOf(input).intValue();
        input = JOptionPane.showInputDialog("Masukan Angka kedua");
        int b = Integer.valueOf(input).intValue();
        int sum = a + b;
        JOptionPane.showMessageDialog(null,a + " + " + b + " = " + sum);
    }
    
}
