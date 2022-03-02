package com.maxtrain.bootcamp;

public class Program {

	public static void main(String[] args) {
		
		var s1 = new Square(5);
		System.out.println(s1.perimeter());
		System.out.println(s1.area());
		
		//Square default test
		var s2 = new Square();
		System.out.println(s2.perimeter());
		System.out.println(s2.area());
		
/*		var r1 = new Rectangle(3,5);
		System.out.println(r1.perimeter());
		System.out.println(r1.area());
		
		
		var q1 = new Quad(2, 3, 4, 5);
		System.out.println(q1.perimeter());
*/
	}

}
