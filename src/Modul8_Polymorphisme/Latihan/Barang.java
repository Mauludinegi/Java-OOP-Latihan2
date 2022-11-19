/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8_Polymorphisme.Latihan;

/**
 *
 * @author GIE
 */
class Barang {

    public String kode, nama;

    public Barang(
            String kode,
            String nama
    ) {
        this.kode = kode;
        this.nama = nama;
    }

    public String tampilBarang() {
        return ("Kode Barang\t: " + kode
                + "\nNama Barang\t: " + nama);
    }
}    
class BukuGambar extends Barang {
    public String kode, nama;
    public int HPP, hargaJual, stok, jumlahJual, total, laba;

    public BukuGambar(
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
    @Override
    public String tampilBarang() {
        return (super.tampilBarang()
                + "\nHPP\t\t: " + HPP
                + "\nHarga Jual\t: " + hargaJual
                + "\nStok\t\t: " + stok
                + "\nJumlah Jual\t: " + jumlahJual
                + "\nStok Sekarang\t: " + stokSekarang()
                + "\nTotal Bayar\t: " + totalBayar()
                + "\nlaba\t\t: " + laba());
    }
}

class Pensil extends Barang {
    public String kode, nama;
    public int HPP, hargaJual, stok, jumlahJual, total, laba;

    public Pensil(
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
    @Override
    public String tampilBarang() {
        return (super.tampilBarang()
                + "\nHPP\t\t: " + HPP
                + "\nHarga Jual\t: " + hargaJual
                + "\nStok\t\t: " + stok
                + "\nJumlah Jual\t: " + jumlahJual
                + "\nStok Sekarang\t: " + stokSekarang()
                + "\nTotal Bayar\t: " + totalBayar()
                + "\nlaba\t\t: " + laba());
    }

    public static void main(String[] args) {
        Barang[] barang = new Barang[2];
        barang[0] = new BukuGambar("B001", "Buku Gambar", 2500, 3000, 5, 2);
        barang[1] = new Pensil("P002", "Pensil 2B", 1500, 1750, 10, 1);
        
        for (int i = 0; i < 2; i++) {
            if(barang[i] instanceof BukuGambar) {
                System.out.println(barang[0].tampilBarang());
            } else {
                System.out.println(barang[1].tampilBarang());
            }
            System.out.println("--------------------------");
        }
        
    }

}
