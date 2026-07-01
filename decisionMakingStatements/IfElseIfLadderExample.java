package decisionMakingStatements;

public class IfElseIfLadderExample {
 public static void main(String[] args) {
	char gen='f';
	if(gen=='f'|| gen=='F')
	{
		System.out.println("Gender is Female");
	}
	else if(gen=='m'||gen=='M')
	{
		System.out.println("Gender is Male");
	}
	else if(gen=='o'||gen=='O')
	{
		System.out.println("Gender is Other");
	}
	else
	{
		System.out.println("Gender is invalid");
	}
}
}
