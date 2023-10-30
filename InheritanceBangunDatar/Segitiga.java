/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceBangunDatar;

/**
 *
 * @author X1
 */
public class Segitiga extends BangunDatar {
    float tinggi;
    float alas;
    float miring;
    @Override
    float luas() {
        float luas;
        luas =(alas * tinggi)/2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }   
    @Override
    float keliling() {
        float keliling = tinggi + alas + miring;
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    }   
}
