package oop;

class goo{
	public static String ClassVar="I class var";
	public String instanceVar="I instance var";
	
	public static void classMethod() { //static있는 변수, 메소드는 class에 존재하는 것과 연결됨
		System.out.println(ClassVar);    //not error, classmethod안에서는 classvar 접근
	//	System.out.println(instanceVar); // error
	}
	public void instaceMethod() {  //static이 없는 변수,메소드는 instance내에서 독립적 존재
		System.out.println(ClassVar);  //not error, instacemethod안에서는 classvar접근 
		System.out.println(instanceVar);  //not error
	}
}

public class StaticAPP {

	public static void main(String[] args) { //static있는 변수, 메소드는 class에 존재하는 것과 연결
		System.out.println(goo.ClassVar);  //not error, class통해 classvar 접근
	//	System.out.println(goo.instanceVar);  //error, class통해 instancevar 접근
		
		goo.classMethod();
	//	goo.instanceMethod(); //error, instance소속이라 class(goo) 통한 접근 불가
		
		goo f1=new goo();
		goo f2=new goo();
		
		System.out.println(f1.ClassVar); //I class var
		System.out.println(f1.instanceVar);  // I instance var
		
		f1.ClassVar="changed by f1";
			System.out.println(goo.ClassVar); //changed by f1
			System.out.println(f2.ClassVar);  //changed by f1
			
			f1.instanceVar="changed by f1";
				System.out.println(f1.instanceVar);  //changed by f1
				System.out.println(f2.instanceVar);  //I instance var
		
		
		
		
	}

}
