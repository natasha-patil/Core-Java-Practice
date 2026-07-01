package decisionMakingStatements;

public class NestedIfExample {
 public static void main(String[] args) {
	String email="natasha787@gmail.com";
	int pass=1234;
	if(email=="natasha787@gmail.com") {
		if(pass==1234) {
			System.out.println("Successfully Login!! ");
		}
		else {
			System.out.println("Invalid Password");
		}
	}
	else {
		System.out.println("Invalid Email");
	}
}
}
