package grade;

public class yourGrade {
	String name ;
	int english;
	int maths;
	int science;
	int arts;
	
	//constructor 
	public yourGrade(String name,int english ,int maths , int science , int arts ) {
	this.name=name;
	this.english=english ;
	this.maths=maths;
	this.science=science;
	this.arts=arts;
	
	
	}
	
	void yourName()
	{
		System.out.println("your name is : "+name);
	}
	
	void englishGrade()
	{	
			if (english>90)
			{
				System.out.println("a = grade");
			}
			else if (english>=80 && english<90) {
				System.out.println("B - grade");
			}
			else if (english>=70 && english<80) {
				System.out.println("C - grade");
			}
			else if (english>=60 && english<70) {
				System.out.println("D - grade");
			}
			else if (english>=50 && english<60) {
				System.out.println("E - grade");
			}
			else {
				System.out.println("you are fail......wtf what are you doing in home .....you can't study ahhh.........!!!!!!!! ");
			}

	}
	void mathsGrade()
	{	
		if (maths>90)
		{
			System.out.println("a=grade");
		}
		else if (maths>=80 && maths<90) {
				System.out.println("B - grade");
			}
			else if (maths>=70 && maths<80) {
				System.out.println("C - grade");
			}
			else if (maths>=60 && maths<70) {
				System.out.println("D - grade");
			}
			else if (maths>=50 && maths<60) {
				System.out.println("E - grade");
			}
			else {
				System.out.println("you are fail......wtf what are you doing in home .....you can't study ahhh.........!!!!!!!! ");
			}

	}
	void scienceGrade()
	{	
		if (science>90)
		{
			System.out.println("a=grade");
		}
			else if (science>=80 && science<90) {
				System.out.println("B - grade");
			}
			else if (science>=70 && science<80) {
				System.out.println("C - grade");
			}
			else if (science>=60 && science<70) {
				System.out.println("D - grade");
			}
			else if (science>=50 && science<60) {
				System.out.println("E - grade");
			}
			else {
				System.out.println("you are fail......wtf what are you doing in home .....you can't study ahhh.........!!!!!!!! ");
			}

	}

	void artsGrade()
	{	
		if (arts>90)
		{
			System.out.println("a=grade");
		}
			else if (arts>=80 && arts<90) {
				System.out.println("B - grade");
			}
			else if (arts>=70 && arts<80) {
				System.out.println("C - grade");
			}
			else if (arts>=60 && arts<70) {
				System.out.println("D - grade");
			}
			else if (arts>=50 && arts<60) {
				System.out.println("E - grade");
			}
			else {
				System.out.println("you are fail......wtf what are you doing in home .....you can't study ahhh.........!!!!!!!! ");
			}

	}
}

