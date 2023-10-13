/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInheritance;

/**
 *
 * @author X1
 */
public class Main {
    public static void main(String[] args) {
        Animals hewan = new Animals();
        
        hewan.bersuara("Doggy");
        Anjing anjing = new Anjing();
        anjing.suara();
        
        hewan.bersuara("Katty");
        Kucing kucing = new Kucing();
        kucing.suara();
        
        hewan.bersuara("Sappy");        
        Sapi sapi = new Sapi();
        sapi.suara();
        
        hewan.bersuara("Wofly");
        Serigala serigala = new Serigala();
        serigala.suara();

        hewan.bersuara("Lion");        
        Singa singa = new Singa();
        singa.suara();
    }
    
}
