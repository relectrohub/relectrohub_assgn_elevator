package com.project.assignment.service;

import java.util.ArrayList;

import com.project.assignment.model.Direction;
import com.project.assignment.model.Door;
import com.project.assignment.model.Elevator;

import com.project.assignment.model.Status;


public class DirectionService {
	
	public static ArrayList<Elevator> getallElevaor(){
		
		Elevator e1 = new Elevator(Direction.UP, Status.MOVING, Door.CLOSE, 2);
		ArrayList<Elevator> list = new ArrayList<>();
		list.add(e1);
		
		return list;
		
		
	}
}
