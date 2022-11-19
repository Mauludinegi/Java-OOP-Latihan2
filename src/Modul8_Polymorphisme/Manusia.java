/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8_Polymorphisme;

/**
 *
 * @author GIE
 */
class Manusia {

    public String nama, hobby, pekerjaan;

    public Manusia(
            String nama,
            String hobby,
            String kerja
    ) {
        this.nama = nama;
        this.hobby = hobby;
        this.pekerjaan = kerja;
    }

    public String tampilManusia() {
        return ("Nama\t\t: " + nama + "\n"
                + "Hobby\t\t: " + hobby + "\n"
                + "Pekerjaan\t: " + pekerjaan + "\n");
    }
}

class Programmer extends Manusia {

    public Programmer(
            String nama,
            String hobby,
            String kerja
    ) {
        super(nama, hobby, kerja);
    }
}

class Ilmuwan extends Manusia {

    public Ilmuwan(
            String nama,
            String hobby,
            String kerja
    ) {
        super(nama, hobby, kerja);
    }
}

class Kegiatan {

    public static void main(String[] args) {
        Manusia[] informasi = new Manusia[2];
        informasi[0] = new Programmer("Egi", "Sepak Bola", "Programmer");
        informasi[1] = new Ilmuwan("Egi", "Bonsai", "Ilmuwan");

        for (int i = 0; i < 2; i++) {
            System.out.println("------------------------------");
            System.out.println(informasi[i].tampilManusia());
        }
    }

}
