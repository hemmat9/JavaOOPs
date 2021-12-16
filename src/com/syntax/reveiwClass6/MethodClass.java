package com.syntax.reveiwClass6;

public class MethodClass {

	int i=10; 
	void welcomeBatch11(){
		
		System.out.println("Batch 11 has an immense potintial");
	}
	
	void printMulipulEntities() {
		
		for (int i=0; i<10; i++) {
			
			System.out.println(i+" ");
		}
	}
	

	void takeArguments(String name) {//parameter(we can have 1 or many parameters)
		System.out.println(name + " is a bright student");
	}
	
	void studentInformation(String name, int id, String course, String division) {
		System.out.println(name +" is having the id nubmer "+ id +
				" enrolled for the course "+ course+ " and secured "
				+division+ " devision in last exams.");
	}
	
	void checkBoolean(boolean isStudnetStudy) {
		if (isStudnetStudy) {
			System.out.println("Student will get a job for sure");
		}else {
			System.out.println("Student will join batch 12 as well");
		}
	}
	
	
	
	
}
