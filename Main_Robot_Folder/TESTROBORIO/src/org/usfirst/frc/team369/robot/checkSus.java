package org.usfirst.frc.team369.robot;

public class checkSus {
	private static double[] vals;
	private int current;
	public int amount;
	private int limit;
	public double bounds;
	public boolean full;
	public double min;
	public double max;
	private String state;
	public checkSus(){
		limit = 10;
		bounds = 25;
		current = 0;
		amount = 1;
		vals = new double[limit];
		full = false;
	}
	public checkSus(double emin, double emax){
		limit = 10;
		min = emin;
		max = emax;
		current = 0;
		amount = 1;
		vals = new double[limit];
		full = false;
		state = "autonomous";
	}
	public void sendVal(double val){
		if(current == limit-1){
			for(int i=0; i < limit - 1; i++){
				vals[i] = vals[i+1];
			}
		}
		vals[current] = val;
		
		if(current < limit-1){
			current++;
			amount++;
		}
		if(amount == limit){
			full = true;
		}
	}
	public void empty(){
		current = 0;
		full = false;
		amount = 0;
	}
	public boolean isStable(){
		boolean stable;
		int goodcount = 0;
		
		if(state == "autonomous"){
			for(int i=0; i < limit; i++){
				if(vals[i] > min && vals[i] < max){
					goodcount++;
				}
			}
			if(goodcount >= Math.round(limit *.8)){
				stable = true;
			}else{
				stable = false;
			}
			return stable;
		}else{
			for(int i=0; i < limit; i++){
				if(i+1 < limit){
					if(vals[i] < vals[i+1] + bounds && vals[i] > vals[i+1] - bounds){
						goodcount++;
					}
				}
			}
			if(goodcount >= Math.round(limit - (limit*.2))){
				stable = true;
			}else{
				stable = false;
			}
			
		}
		return stable;
	}
}
