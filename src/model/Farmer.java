package model;

import java.util.Random;

public class Farmer extends Worker {
	
	public Farmer(Random generator) {
		super(generator);
	}

	@Override
	public double gather() {
		return this.gather_rate * this.curr_count;
	}
	

	@Override
	public double gatherSpecialResource() {
		
		// r = r1 + r2 - floor(r1+r2)
		
		
	}
	
	
	public void getSkinningUpgrade() {
		this.special_chance += 0.1;
	}
}
