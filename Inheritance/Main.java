/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author X1
 */
public class Main {
    public static void main(String[] args) {
    Enemy monster = new Enemy();
    
    Zombie zumbi = new Zombie();
    zumbi.name ="Zuombie";
    zumbi.hp= 80;
    zumbi.attackpoin=15;
    System.out.println(zumbi.name +" Healt Point = "+zumbi.hp + " Attack poin = "+zumbi.attackpoin);
    zumbi.attack();
    zumbi.walk();
    
    Pocong hantupocong = new Pocong();
    hantupocong.name ="Puocong";
    hantupocong.hp= 85;
    hantupocong.attackpoin=10;
    System.out.println(hantupocong.name +" Healt Point = "+hantupocong.hp + " Attack poin = "+hantupocong.attackpoin);
    hantupocong.attack();
    hantupocong.jump();
    
    Burung garuda = new Burung();
    garuda.name ="Guaruda";
    garuda.hp= 100;
    garuda.attackpoin=5;  
    System.out.println(garuda.name +" Healt Point = "+garuda.hp + " Attack poin = "+garuda.attackpoin);
    garuda.attack();
    garuda.walk();
    garuda.jump();
    garuda.fly();
    }
}
