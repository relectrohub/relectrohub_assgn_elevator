package com.project.assignment.model;

public class Floor {
	
	final int max_Floor=10;
	final int min_Floor=20;
	int current_Floor;
	public int getCurrent_Floor() {
		return current_Floor;
	}
	public void setCurrent_Floor(int current_Floor) {
		this.current_Floor = current_Floor;
	}
	public int getMax_Floor() {
		return max_Floor;
	}
	public int getMin_Floor() {
		return min_Floor;
	}
	public Floor(int current_Floor) {
		super();
		this.current_Floor = current_Floor;
	}
	@Override
	public String toString() {
		return "Floor [max_Floor=" + max_Floor + ", min_Floor=" + min_Floor + ", current_Floor=" + current_Floor + "]";
	}
	
	

}
