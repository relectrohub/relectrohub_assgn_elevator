package com.project.assignment.model;

public class Elevator {
	
	private Direction directionToGo;
	private Status currentStatus;
	private Door doorStatus;
	private int currentFloor;
	
	public Direction getDirectionToGo() {
		return directionToGo;
	}
	public void setDirectionToGo(Direction directionToGo) {
		this.directionToGo = directionToGo;
	}
	public Status getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(Status currentStatus) {
		this.currentStatus = currentStatus;
	}
	public Door getDoorStatus() {
		return doorStatus;
	}
	public void setDoorStatus(Door doorStatus) {
		this.doorStatus = doorStatus;
	}
	public int getCurrentFloor() {
		return currentFloor;
	}
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	public Elevator(Direction directionToGo, Status currentStatus, Door doorStatus, int currentFloor) {
		super();
		this.directionToGo = directionToGo;
		this.currentStatus = currentStatus;
		this.doorStatus = doorStatus;
		this.currentFloor = currentFloor;
	}

	
	@Override
	public String toString() {
		return "Elevator [directionToGo=" + directionToGo + ", currentStatus=" + currentStatus + ", doorStatus="
				+ doorStatus + ", currentFloor=" + currentFloor + "]";
	}
	
	

}
