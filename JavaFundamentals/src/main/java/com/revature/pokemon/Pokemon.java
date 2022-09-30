package com.revature.pokemon;

import java.util.Random;

public class Pokemon {

    /*
    We need to think about what we want to store about out pokemon

    Some things we may want are name, level, health, and attack
     */

    String name;
    int level;
    int health;
    int attack;
    boolean fainted;

    //We might want to find a way to construct our pokemon object



    public Pokemon(String name){
        this.name = name;
        //How do we randomize these values?
        Random random = new Random();

        //Now we have a random object lets create some random values

        this.level = random.nextInt(100) + 1;

        this.health = random.nextInt(100) + 1;

        this.attack = random.nextInt(100) + 1;

        this.fainted = false;


    }





    /*
    Now that we have a way to create pokemon

    We need to create a way for them to battle

    We can also create a catch attempt
     */

    public Pokemon battle(Pokemon opponent){
        //How do we battle?

        //When my pokemon attacks another pokemon, my attack should reduce their health and
        //MY pokemons health should reduce when attacked
//
//        opponent.health -= this.attack;
//
//        this.health -= opponent.attack;
//
//        return opponent;
        //This is for when we attack them
        if (opponent.health - this.attack <= 0){
            //Opponent health should be marked as fainted
            opponent.health = 0;

            //How do we mark that a pokemon is fainted or not
            //Let's create a boolean value to determine if the pokemon is fainted or not

            opponent.fainted = true;

        } else{
            //This means their health is positive and can keep battling
            opponent.health -= this.attack;
        }



        if (this.health - opponent.attack <= 0){
            //Opponent health should be marked as fainted
            this.health = 0;

            //How do we mark that a pokemon is fainted or not
            //Let's create a boolean value to determine if the pokemon is fainted or not

            this.fainted = true;

        } else{
            //This means their health is positive and can keep battling
            this.health -= opponent.attack;
        }
        return opponent;
    }

}











