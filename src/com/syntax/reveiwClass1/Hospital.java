package com.syntax.reveiwClass6;

public class Hospital {

	public static void main(String[] args) {
	
		Doctor doctor1 = new Doctor("John","Doe","Dentist",20000);
		Doctor.hospital="John Muir";
		doctor1.printInfo();
		doctor1.work();
		
		Doctor doctor2 =new Doctor("Jane","Smith","Cardialogist");
		doctor2.work();
		doctor2.hospital="JW hospital";//changing static variable effect all the static value
		
		System.out.println();
		doctor1.work();
		doctor2.work();
		System.out.println(doctor1.lastName);
		System.out.println(doctor2.lastName);
		Doctor.companyName();
		
		doctor1.treatPatient("James");
		doctor2.treatPatient("Anna");
	}

}
