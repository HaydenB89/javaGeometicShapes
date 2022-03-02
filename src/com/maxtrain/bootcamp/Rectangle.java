package com.maxtrain.bootcamp;

public class Rectangle extends Quad {
	
	public int area() {
		return super.getSide1() * super.getSide2(); //getting sides from quad
	}
	
	public Rectangle(int side1, int side2) {
		super(side1, side2, side1, side2);//must put in order moving around the shape
	}
	
	
}
