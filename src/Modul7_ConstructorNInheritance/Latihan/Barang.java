/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7_ConstructorNInheritance.Latihan;

class Barang {

    private String kode, nama;

    Barang(
            String kode,
            String nama
    ) {
        this.kode = kode;
        this.nama = nama;
    }

    public String tampilBarang() {
        return ("Input"
                +"\nKode Barang\t: " + kode
                + "\nNama Barang\t: " + nama);
    }
}

class BukuGambar extends Barang {

    private String kode, nama;
    private int HPP, hargaJual, stok, jumlahJual, total, laba;

    BukuGambar(
            String kode,
            String nama,
            int HPP,
            int hargaJual,
            int stok,
            int jumlahJual
    ) {
        super(kode, nama);
        this.HPP = HPP;
        this.hargaJual = hargaJual;
        this.stok = stok;
        this.jumlahJual = jumlahJual;
    }

    //logika
    int stokSekarang() {
        stok -= jumlahJual;
        return stok;
    }

    int totalBayar() {
        total = jumlahJual * hargaJual;
        return total;
    }

    int laba() {
        laba = total - (HPP * jumlahJual);
        return laba;
    }

    //tampilan
    String tampilBukuGambar() {
        return (super.tampilBarang()
                + "\nHPP\t\t: " + HPP
                + "\nHarga Jual\t: " + hargaJual
                + "\nStok\t\t: " + stok
                + "\nJumlah Jual\t: " + jumlahJual)
                + "\nOUTPUT"
                +"\nStok Sekarang\t: " + stokSekarang()
                + "\nTotal Bayar\t: " + totalBayar()
                + "\nlaba\t\t: " + laba();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        BukuGambar buku = new BukuGambar("B001", "Buku Gambar", 2500, 3000, 5, 2);
        System.out.println(buku.tampilBukuGambar());
    }

}
