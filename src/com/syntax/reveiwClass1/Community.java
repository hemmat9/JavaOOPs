package com.syntax.reveiwClass;

public class Community {

	public static void main(String[] args) {
	
		House house1 = new House();//(house1 is a variable) new keyword creates an object
		house1.area=2000;
		house1.color="grey";
		house1.rooms=4;
		//house1.bathroom=4; bathroom is not a field in the class

		House house2 = new House();//(house2 is a reference variable)
		house2.area=2000;
		house2.color="grey";
		house2.rooms=4;
	}

}
