/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duel;

/**
 *
 * @author Leonardo
 */
public class Pokemon {
    public String name;
    public String ability;
    int hp;
    int attack;
    int defense;
    int spAtk;
    int spDef;
    int speed;

    public Pokemon(String name, String ability, int hp, int attack, int defense, int spAtk, int spDef, int speed) {
        this.name = name;
        this.ability = ability;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.speed = speed;
    }
    
    public void showInfo(){
    System.out.println(
                "\n\nName: " + this.name
                + "\nAbility: " + this.ability
                + "\nHP: " + this.hp
                + "\nAttack: " + this.attack
                + "\nDefense: " + this.defense
                + "\nSpecial Attack: " + this.spAtk
                + "\nSpecial Defense: " + this.spDef
                + "\nSpeed: " + this.speed
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpAtk() {
        return spAtk;
    }

    public void setSpAtk(int spAtk) {
        this.spAtk = spAtk;
    }

    public int getSpDef() {
        return spDef;
    }

    public void setSpDef(int spDef) {
        this.spDef = spDef;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
    
}
