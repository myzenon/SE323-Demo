package view;


import java.util.List;

import model.impl.Plant;
import model.impl.Seed;

public class ConsoleMenu {
	public void showAll() {
		System.out.println("--Select an action--");
		System.out.println("1.View Plants in Garden");
		System.out.println("2.Plant a seed");
		System.out.println("3.Water a plant");
		System.out.println("4.Harvest a plant");
		System.out.println("5.View iventory");
		System.out.println("6.Sleep One day");
		System.out.println("Please select an action (1-6)");
	};
	public void viewPlants(List<Plant> plants) {
		System.out.println("--Your Garden Bed--");
		for(int i= 0 ; i < plants.size() ;i++){
			System.out.println((i+1)+"."+plants.get(i).getName());
			System.out.println(" Health:"+plants.get(i).getHealth()+
					" WaterLevel:"+plants.get(i).getWater()+
					" Age:"+plants.get(i).getAge());
	
		}
		System.out.println("any number to continue..");	
	};
	public void seedPlant(List<Seed> seeds){
		System.out.println("--Pick a seed--");
		for(int i=0; i < seeds.size();i++ ){
			System.out.println((i+1)+"."+seeds.get(i).getName());
		}
	};
	
	public void waterPlant(List<Plant> plants) {
		System.out.println("--Pick a plant to water--");
		for(int i= 0 ; i < plants.size() ;i++){
			System.out.println((i+1)+"."+plants.get(i).getName()
					+" Health:"+plants.get(i).getHealth()
					+" WaterLevel:"+plants.get(i).getWater());
		}
	};
	public void harvestPlant() {};
	public void viewInventory() {};
	public void sleep() {
		System.out.println("A long hardworking day have past!");	
		System.out.println("any number to continue..");	
	};
}
