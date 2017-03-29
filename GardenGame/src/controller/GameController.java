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
        			//plant selected seed
        			plantSeed(bag.getSeeds().get(menuState-1));
        			break;
        			
            case 3: prompt.waterPlant(gardenBed.getPlants());
            		//water selected plant
    				menuState = in.nextInt();
            		waterPlant(gardenBed.getPlants().get(menuState-1));

            		
                     break;
            case 4:
                     break;
            case 5:  
                     break;
            case 6: sleep();
            		prompt.sleep();
            		menuState = in.nextInt();
                     break;
                     
        }
        	
    	}while(menuState != 7);
 
    }

    public boolean plantSeed(Seed seed) {
    	gardenBed.addPlant(seed.getPlant()); 
        return true;
    }

    public boolean waterPlant(Plant plant) {
    	plant.setWater(plant.getMax_water());
    	return true;
    }

    public List<Plant> viewPlantsWithFriut() {
        return null;
    }

    public void harvestFruits(List<Fruit> fruits, Plant plant) {

    }

    public List<Item> getInventory() {
        return null;
    }

    public void sleep() {
    	
    	for(int i = 0 ;i<gardenBed.getPlants().size();i++){
    		if(gardenBed.getPlants().get(i).getWater()>0){//minus from water armor
    			gardenBed.getPlants().get(i).setWater(
    					gardenBed.getPlants().get(i).getWater()-1);
    		}else{
    			if(gardenBed.getPlants().get(i).getHealth()>0){//minus from health bar
    				gardenBed.getPlants().get(i).setHealth(
    						gardenBed.getPlants().get(i).getHealth()-1);
    			}else{//Die 
    				gardenBed.removePlant(i);
    				
    			}
    		}
    	}
    }


}
