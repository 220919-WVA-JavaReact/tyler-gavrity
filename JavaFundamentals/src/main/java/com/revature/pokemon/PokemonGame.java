package com.revature.pokemon;

import java.util.Random;
import java.util.Scanner;

public class PokemonGame {

    /*
    Goal: We want to create some sort of console application that allows us to traverse around and catch/battle pokemon
    For those uninitiated, in the game of pokemon you can have AT MOST 6 pokemon with you at a time
    We should be able to maybe catch a pokemon, view our current pokemon and maybe view our party
     */

    public static void main(String[] args) {
        // Before we get too deep let's make sure we can create some pokemon with random values

        /*
        // Testing pokemon creation
        Pokemon p1 = new Pokemon("Sandshrew");
        Pokemon p2 = new Pokemon("Shinx");
        Pokemon p3 = new Pokemon("Staryu");
        Pokemon p4 = new Pokemon("Sableye");
        System.out.println(p1.name + " " + p1.attack + " " + p1.level + " " + p1.health);
        System.out.println(p2.name + " " + p2.attack + " " + p2.level + " " + p2.health);
        System.out.println(p3.name + " " + p3.attack + " " + p3.level + " " + p3.health);
        System.out.println(p4.name + " " + p4.attack + " " + p4.level + " " + p4.health);
        // Testing pokemon battling
        p1.battle(p2);
        System.out.println("------------------------------------------------------------");
        System.out.println(p1.name + " " + p1.attack + " " + p1.level + " " + p1.health + " " + p1.fainted);
        System.out.println(p2.name + " " + p2.attack + " " + p2.level + " " + p2.health + " " + p2.fainted);
         */


        // We've tested some of our logic time to start creating an app

        boolean running = true;

        Scanner input = new Scanner(System.in);

        // Let's create our party of pokemon

        Pokemon[] party = new Pokemon[6];
        Pokemon p1 = new Pokemon("Sandshrew");
        party[0] = p1;

        int partySize = 1;

        String[] possibleEncounters = {"Shinx", "Sableye", "Staryu", "Lugia", "Pikachu", "Umbreon", "Sylveon", "Bayleaf"};

        Random random = new Random();

        // this while loop powers our main app
        while (running) {
            // All of our app stuff should go in here and this should only terminate when the user says so

            // Let's simulate an encounter

            // We need to give ourselves a pokemon and enter a battle with another one

            // Take some time to decipher the logic here
            Pokemon p2 = new Pokemon(possibleEncounters[random.nextInt(possibleEncounters.length)]);

            // SO let's start creating the logic for a menu

            System.out.println("You've encountered a wild " + p2.name);

            // Now we need to give options to the player
            System.out.println("Type 'run' to run, 'battle' to battle, and 'party' to view your party, or press 'q' to quit");

            // Now we need to collect this input from the user
            // and store it in a variable

            String choice = input.nextLine();

            // We'll just this print this out to test that it works before writing logic
            // System.out.println(choice);

            // Let's do some logic based off the input
            if (choice.equals("run")){
                // Logic for running
                System.out.println("You ran from the battle!");
            } else if (choice.equals("battle")){
                System.out.println("Type attack to attack or catch to catch");
                // If we choose battle we have the suboptions to attack or to catch
                String subchoice = input.nextLine();

                if(subchoice.equals("attack")){
                    // Logic for battling
                    p1.battle(p2);
                    System.out.println(
                            "Your pokemon: " + p1.name + "\n"
                                    + "Health: " + p1.health + "\n"
                                    + "Fainted: " + p1.fainted
                    );
                    System.out.println(
                            "Opponent Pokmemon: " + p2.name + "\n"
                                    + "Health: " + p2.health + "\n"
                                    + "Fainted: " + p2.fainted
                    );
                } else if (subchoice.equals("catch")){
                    // This is where we add the pokemon to our party
                    // Let's check to see if we have 6 pokemon, if not, add to the party
                    if (partySize < 6){
                        party[partySize] = p2;
                        partySize += 1;
                        for(int i = 0; i< party.length; i++){
                            if(party[i] != null) {
                                System.out.println(party[i].name);
                            }
                        }

                    } else {
                        System.out.println("You already have 6 pokemon");
                        break;
                    }

                }
            } else if(choice.equals("party")){
                System.out.println("Party");
                for(int i = 0; i< party.length; i++){
                    if(party[i] != null) {
                        System.out.println(party[i].name);
                    }
                }
            } else if(choice.equals("q")){
                break;
            }
            else{
                System.out.println("Invalid input");
            }


        }


    }
}