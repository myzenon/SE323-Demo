package controller;

import model.Item;
import model.impl.*;
import view.ConsoleMenu;

import java.util.List;
import java.util.Scanner;

public class GameController {
	private ConsoleMenu prompt;
    private GardenBed gardenBed;
    private Bag bag;
    private Scanner in;
    private int menuState = 0;
    public GameController(){
    	prompt = new ConsoleMenu();
    	gardenBed = new GardenBed();
    	bag = new Bag();
    	//test mock, no shop
    	bag.addSeed(new Seed("Mango",new Plant("Mango Tree",3,3,3)));
    	bag.addSeed(new Seed("Apple",new Plant("Apple Tree",3,3,3)));;
    	bag.addSeed(new Seed("Orange",new Plant("Orange Tree",3,3,3)));
    	
    	in = new Scanner(System.in);

    	
    }
    public void startGame(){
       	do{
       		prompt.showAll();
        	menuState = in.nextInt();
        	switch (menuState) {
            case 1:  prompt.viewPlants(gardenBed.getPlants());
            		menuState = in.nextInt();
            		
                     break;
            case 2:  prompt.seedPlant(bag.getSeeds());
        			menuState = in.nextInt();
        			
        			gardenBed.addPlant(bag.getSeeds().get(menuState-1).getPlant()); 
        			//debug purpose
        			System.out.println("Planted:"+bag.getSeeds().get(menuState-1).getPlant().getName());
        			break;
            case 3: 
                     break;
            case 4:
                     break;
            case 5:  
                     break;
            case 6: 
                     break;
                     
        }
        	
    	}while(menuState != 7);
 
    }

    public Plant[][] getPlants() {
        return null;
    }

    public List<Seed> getSeeds() {
        return null;
    }

    public Plant[][] getGardenBed() {
        return null;
    }

    public boolean plantSeed(int gardenPosition, Seed seed) {
        return false;
    }

    public void waterPlant(Plant plant) {

    }

    public void waterPlants() {}

    public List<Plant> viewPlantsWithFriut() {
        return null;
    }

    public void harvestFruits(List<Fruit> fruits, Plant plant) {

    }

    public List<Item> getInventory() {
        return null;
    }

    public void sleep() {

    }


}
