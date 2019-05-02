package com.opencyon;

public class Greeter {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a = new Add();
		int add = a.addNumber(10, 30);
		System.out.println(add);
		
	}

}
class Add{
	public int addNumber(int x, int y) {
		System.out.println(x + "" +y);
		return x+y;
	}
}
