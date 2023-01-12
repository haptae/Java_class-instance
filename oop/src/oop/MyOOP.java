package oop;

public class MyOOP {

	public static void main(String[] args) {

		String delimiter="---";  //3rd String delimiter="---"기입 
		printA(delimiter);   //2nd  "---"기입   4rd. "---" > delimiter
		printA(delimiter);
		printB(delimiter);
		printB(delimiter);
		
		delimiter="***"; 
		printA(delimiter);
		printA(delimiter);
		printB(delimiter);
		printB(delimiter);


	}

	public static void printA(String delimiter) { //1st. String delimiter 기입
		System.out.println(delimiter);            // "---" > delimiter
		System.out.println("A");
		System.out.println("A");
	}
		
		public static void printB(String delimeter) {
			System.out.println(delimeter);
			System.out.println("B");
			System.out.println("B");
	}

}
