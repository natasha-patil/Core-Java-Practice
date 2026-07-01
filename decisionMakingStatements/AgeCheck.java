package decisionMakingStatements;

public class AgeCheck {
 public static void main(String[] args) {
	int age=20;
	if(age>0 && age<=2) {
		System.out.println("Infant");
	}
	else if(age>2 && age<=5) {
		System.out.println("Toddler");
	}
	else if(age>5 && age<=12) {
		System.out.println("Child");
	}
	else if(age>12 && age<=18) {
		System.out.println("Teen");
	}
	else if(age>18 && age<=60) {
		System.out.println("Adult");
	}
	else if(age>60)
	{
		System.out.println("Senior Citizen");
	}
	else
	{
		System.out.println("Invalid Age");
	}
}
}
