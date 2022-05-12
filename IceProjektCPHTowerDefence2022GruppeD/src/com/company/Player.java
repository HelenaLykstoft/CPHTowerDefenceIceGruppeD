package com.company;

public class Player {
    private String name;
    private int currentScore;
    private int endScore;
    private int startBalance;
    private int currentBalance;
    private int updatedBalance;
    private int maxHealth;
    private int currentHealth;

    public Player (int health){
        this.maxHealth = health;
        this.currentHealth = health;
    }


    public void getName(){

    }
    public void getCurrentScore(){

    }
    public void getEndScore(){

    }
    public void getStartBalance(){

    }
    public void getCurrentBalance(){

    }
    public void getUpdatedBalance(){

    }
    public int getHealth(){
        return this.currentHealth;
    }
    public void setHealth(int health){
        this.currentHealth = health;
    }
    public void setName(){

    }
    public void setScore(){

    }
    public void setEndScore(){

    }
    public void setStartBalance(){

    }
    public void setCurrentBalance(){

    }
    public void setUpdatedBalance(){

    }
    public void takeDamage(int damage){
        System.out.println("you took damage!");
        this.currentHealth = this.currentHealth-damage;
        if(this.currentHealth <= 0){
            System.out.println("game over!");
        }
    }
    //@Override
    //public String ToString();


}
