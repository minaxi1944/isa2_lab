package calculator;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1=20,num2=10;
		Calc c1=new Calc(num1,num2);
		int addition=c1.add();
		int subtraction=c1.sub();
		int multiplication=c1.mul();
		System.out.println("add== "+addition+"  subtract==  "+subtraction+"  multiplication== "+multiplication);
				
	}

}
