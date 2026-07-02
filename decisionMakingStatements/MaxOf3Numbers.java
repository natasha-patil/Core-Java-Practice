package decisionMakingStatements;

public class MaxOf3Numbers {
 public static void main(String[] args) {
	int a=40,b=60,c=90;
	// using nested if
	if(a>b) {
		if(a>c) {
			System.out.println("a="+a+" is Max");
		}
		else {
			System.out.println("c="+c+" is Max");	
		}
	}
	else {
		if(b>c)
		{
			System.out.println("b="+b+" is Max");
		}
		else {
			
			System.out.println("c="+c+" is Max");
		}
	}
	
	/* using if else if ladder
	if(a>b && a>c) {
		System.out.println("a="+a+" is Max");
	}
	else if(b>a && b>c) {
		System.out.println("b="+b+" is Max");
	}
	else {
		System.out.println("c="+c+" is Max");
	}*/
}
}
