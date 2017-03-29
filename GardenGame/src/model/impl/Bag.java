package model.impl;

import model.Item;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Item> items;
    private List<Seed> seeds;
    public Bag(){
    	items = new ArrayList<Item>();
    	seeds = new ArrayList<Seed>();
    }
    public List<Seed> getSeeds() {
        return seeds;
    }
    public void addSeed(Seed seed){
    	seeds.add(seed);
    }
}
