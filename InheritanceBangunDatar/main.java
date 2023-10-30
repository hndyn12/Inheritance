/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceBangunDatar;

/**
 *
 * @author X1
 */
public class main {
    public static void main(String[] args) {
        //object bangun datar
        BangunDatar bangundatar= new BangunDatar();
        
        Persegi persegi = new Persegi();
        persegi.sisi = 5;
                
        Lingkaran lingkaran= new Lingkaran();
        lingkaran.r =22;
        
        Persegipanjang persegipanjang = new Persegipanjang();
        persegipanjang.lebar = 4;
        persegipanjang.panjang= 8;
        
        Segitiga segitiga = new Segitiga();
        segitiga.alas=12;
        segitiga.tinggi=9;
        segitiga.miring=15;
        
        //menunjukkan inheritage
        bangundatar.luas();
        bangundatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        persegipanjang.luas();
        persegipanjang.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
                
        segitiga.luas();
        segitiga.keliling();
    }
}
