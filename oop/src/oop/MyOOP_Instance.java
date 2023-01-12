package oop;

class print{   //class 이름은 print
	public String delimiter="";  //instance는 static 제거
	public  void A() {      //instance는 static 제거
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
		
		public void B() {    //instance는 static 제거
			System.out.println(delimiter);
			System.out.println("B");
			System.out.println("B");
	}
	
}


public class MyOOP_Instance {  //파일 이름과 같은 class는 public class

		public static void main(String[] args) {
			
			print p1= new print();  //P1은 print의 instance
			p1.delimiter="---";
			p1.A();
			p1.A();
			p1.B();
			p1.B();
			
			print p2=new print();
			p2.delimiter="***";
			p2.A();
			p2.A();
			p2.B();
			p2.B();
			
			p1.A();
			p2.A();
			p1.A();
			p2.A();
		
			
			
		}
		



	}

