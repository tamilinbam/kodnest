package ownexample1;

public class classobj {
	String name ;
	int sub1;
	int sub2;
	int sub3;
	
	public classobj (String name , int sub1 , int sub2 , int sub3 ) {
		this.name=name;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	void average() {
		double grade = (sub1+sub2+sub3)/3;
		System.out.println("your grade is;" +grade);
	}
	void disdetails() {
		System.out.println("your name is "+name+" your sub mark is "+" sub1: "+sub1+" sub2: "+sub2+" sub3: "+sub3);
	}
}
