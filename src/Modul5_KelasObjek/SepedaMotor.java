/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_KelasObjek;

class SepedaMotor {

    private String merk;

    public void inputMerk(String merk) {
        this.merk = merk;
    }

    public String tampilMerk() {
        return merk;
    }
}

class Suzuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SepedaMotor motor = new SepedaMotor();
        motor.inputMerk("Suzuki");
        System.out.println("Merk motor ini adalah " + motor.tampilMerk());
    }

}
