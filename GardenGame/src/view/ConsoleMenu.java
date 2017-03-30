package view;


import java.util.List;
import java.util.Scanner;

import controller.GameController;
import model.impl.Bag;
import model.impl.Plant;
import model.impl.Seed;

public class ConsoleMenu {

    private Scanner in;
    private int menuState = 0;

    private GameController gameController;

    public ConsoleMenu(GameController gameController) {
        in = new Scanner(System.in);
        this.gameController = gameController;
    }

    public void showAll() {
        System.out.println("--Select an action--");
        System.out.println("1.View Plants in Garden");
        System.out.println("2.Plant a seed");
        System.out.println("3.Water a plant");
        System.out.println("4.Harvest a plant");
        System.out.println("5.View inventory");
        System.out.println("6.Sleep One day");
        System.out.println("Please select an action (1-6)");
        menuState = in.nextInt();
        switch (menuState) {
            case 1:
                viewPlants();
                break;
            case 2:
                seedPlant();
                break;
            case 3:
                waterPlant();
                break;
            case 4:
                harvestPlant();
                break;
            case 5:
                viewInventory();
                break;
            case 6:
                sleep();
                break;

        }
    }

    public void viewPlants() {
        List<Plant> plants = gameController.getPlants();
        System.out.println("--Your Garden Bed--");
        for (int i = 0; i < plants.size(); i++) {
            System.out.println((i + 1) + "." + plants.get(i).getName());
            System.out.println(" Health:" + plants.get(i).getHealth() +
                    " WaterLevel:" + plants.get(i).getWater() +
                    " Age:" + plants.get(i).getAge() +
                    " Days until next phase:" + plants.get(i).getDaysUntilNextPhase());

        }
		System.out.println("any number to continue..");
		menuState = in.nextInt();
    }


    public void seedPlant() {
        List<Seed> seeds = gameController.getSeeds();
        System.out.println("--Pick a seed--");
        for (int i = 0; i < seeds.size(); i++) {
            System.out.println((i + 1) + "." + seeds.get(i).getName());
        }
        menuState = in.nextInt();
        //plant selected seed
        gameController.plantSeed(seeds.get(menuState - 1));
    }



    public void waterPlant() {
        List<Plant> plants = gameController.getPlants();
        System.out.println("--Pick a plant to water--");
        for (int i = 0; i < plants.size(); i++) {
            System.out.println((i + 1) + "." + plants.get(i).getName()
                    + " Health:" + plants.get(i).getHealth()
                    + " WaterLevel:" + plants.get(i).getWater());
        }
        //water selected plant
        menuState = in.nextInt();
        gameController.waterPlant(gameController.getPlants().get(menuState - 1));
    }



    public void harvestPlant() {
        List<Plant> plants = gameController.viewPlantsWithFruit();
        System.out.println("--Plants available for harvest--");
        for (int i = 0; i < plants.size(); i++) {
            System.out.println((i + 1) + "." + plants.get(i).getName());
        }
        System.out.println("any number to continue..");
        menuState = in.nextInt();
        gameController.harvestFruits(plants, menuState);
    }



    public void viewInventory() {
        Bag bag = gameController.getBag();
        System.out.println("--Seeds in the bag--");
        for (int i = 0; i < bag.getSeeds().size(); i++) {
            System.out.println((i + 1) + "." + bag.getSeeds().get(i).getName());
        }
        System.out.println("--Fruits in the bag--");
        for (int i = 0; i < bag.getFruits().size(); i++) {
            System.out.println((i + 1) + "." + bag.getFruits().get(i).getName());
        }
        System.out.println("any number to continue..");
        menuState = in.nextInt();
    }



    public void sleep() {
        gameController.sleep();
        System.out.println("A long hardworking day have past!");
        System.out.println("any number to continue..");
        menuState = in.nextInt();
    }

}
