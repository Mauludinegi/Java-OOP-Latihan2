/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6_Encapsulation.Latihan;

/**
 *
 * @author GIE
 */
public class Barang {
    private String kode,nama;
    private int HPP,harga,stok,jumlahJual,total,laba;
    
    public void inputKode(String kode) {
        this.kode = kode;
    }
    
    public void inputNama(String nama) {
        this.nama = nama;
    }
    
    public void inputHPP(int HPP) {
        this.HPP = HPP;
    }
    
    public void inputHarga(int harga) {
        this.harga = harga;
    }
    
    public void inputStok(int stok) {
        this.stok = stok;
    }
    public void inputJual(int jumlahJual) {
        this.jumlahJual = jumlahJual;
    }
    
    //tampilan
    public String tampilKode() {
        return kode;
    }
    
    public String tampilNama() {
        return nama;
    }
    
    public int tampilHPP() {
        return HPP;
    }
    
    public int tampilHarga() {
        return harga;
    }
    
    public int tampilStok() {
        return stok;
    }
    
    public int tampilJumlahJual() {
        return jumlahJual;
    }
    
    public int tampilStokSekarang() {
        stok -= jumlahJual;
        return stok;
    }
    
    public int tampilTotalBayar() {
        total = harga * jumlahJual;
        return total;
    }
    
    public int tampilLaba() {
        laba = total - (jumlahJual * HPP);
        return laba;
    }
    
    
    public static void main(String[] args) {
        Barang bukuGambar = new Barang();
        bukuGambar.inputKode("B001");
        bukuGambar.inputNama("BUKU GAMBAR");
        bukuGambar.inputHPP(2500);
        bukuGambar.inputHarga(3000);
        bukuGambar.inputStok(5);
        bukuGambar.inputJual(2);
        
        //Tampilan
        System.out.println("INPUT: ");
        System.out.println("Kode Barang  :" + bukuGambar.tampilKode());
        System.out.println("Nama Barang  :" + bukuGambar.tampilNama());
        System.out.println("HPP          :" + bukuGambar.tampilHPP());
        System.out.println("Harga Jual   :" + bukuGambar.tampilHarga());
        System.out.println("Stok         :" + bukuGambar.tampilStok());
        System.out.println("Jumlah Jual  :" + bukuGambar.tampilJumlahJual());
        System.out.println("OUTPUT:");
        System.out.println("Stok Sekarang:" + bukuGambar.tampilStokSekarang());
        System.out.println("Total Bayar  :" + bukuGambar.tampilTotalBayar());
        System.out.println("Laba         :" + bukuGambar.tampilLaba());
        
    }
    
}
