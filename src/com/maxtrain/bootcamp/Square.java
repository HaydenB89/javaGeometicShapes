package com.maxtrain.bootcamp;

public class Square extends Rectangle{
	
	public Square(int sides) {
		super(sides, sides);
	}
	//default constructor calling "this" as the same class' constructor
	public Square() {
		this(1); 
	}
	
}
