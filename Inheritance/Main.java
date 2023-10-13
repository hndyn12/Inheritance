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
    zumbi.attack();
    zumbi.walk();
    
    Pocong hantupocong = new Pocong();
    hantupocong.attack();
    hantupocong.jump();
    
    Burung garuda = new Burung();
    garuda.attack();
    garuda.walk();
    garuda.jump();
    garuda.fly();
    }
}
