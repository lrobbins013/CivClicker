package model;

import java.util.Random;

public abstract class Worker {
	
	protected int curr_count;
	protected double gather_rate;
	protected double special_chance;
	
	private Random generator;
	
	public Worker(Random generator) {
		this.curr_count = 0;
		this.special_chance = 0;
		
		this.generator = generator;
	}
	
	public void addWorkers(int amount) {
		this.curr_count += amount;
	}
	
	public abstract double gather();
	
	public abstract double gatherSpecialResource();
}
