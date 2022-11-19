/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7_ConstructorNInheritance;

/**
 *
 * @author GIE
 */
public class Pelajar {
    
    private String nama;
    private long tinggi;
    private long berat;

    Pelajar(
            String nama,
            long tinggi,
            long berat
    ) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public String tampilPelajar() {
        return ("Nama\t\t: " + nama
                + "\nTinggi\t\t: " + tinggi
                + "\nBerat\t\t: " + berat + "\n");
    }
}


class Siswa extends Pelajar {

    private String nim, asalSekolah;
    private int nilai;

    public Siswa(
            String nama,
            long tinggi,
            int berat,
            String nim,
            String asalSekolah,
            int nilai
    ) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.asalSekolah = asalSekolah;
        this.nilai = nilai;
    }

    public String tampilSiswa() {
        return (super.tampilPelajar()
                + "NIM\t\t: " + nim
                + "\nAsal Sekolah\t: " + asalSekolah
                + "\nNilai\t\t: " + nilai);
    }
}


class main {

    public static void main(String[] args) {
        // TODO code application logic here
        var ti = new Siswa("Egi", 170, 59, "A22100036", "SMA Tanjungkerta", 90);
        System.out.println(ti.tampilSiswa());
    }

}
