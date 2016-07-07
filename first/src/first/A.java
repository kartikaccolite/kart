package first;

import java.util.Scanner;

public class A implements A_interface {

	@Override
	public Integer add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public Integer sub(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public Long mul(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return (long) (a*b);
	}

	@Override
	public Integer div(Integer a, Integer b) throws ArithmeticException {
		// TODO Auto-generated method stub
		return a/b;
	}
	public static void main(String args[]) {
		A obj = new A();
		Integer val1,val2;
		Integer choice=1;
		//@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	
		/*System.out.println("Enter first num");
		val1 = input.nextInt();
		
		System.out.println("Enter second num");
		val2 = input.nextInt();
		*/
		System.out.println("Enter your selection\n 1.addition 2.sub 3.mul 4.div");
		choice = input.nextInt();
	//int choice=1;
		//	 choice=1;
		switch(choice) {
		case 1:
			System.out.println(obj.add(1, 2));
			break;
		case 2:
			System.out.println(obj.sub(1, 2));
			break;
		case 3:
			System.out.println(obj.mul(1, 2));
			break;
		case 4:
			try{
			System.out.println(obj.div(1, 0));
			} catch(ArithmeticException e) {
				System.out.println("Can't divide by zero");
			}
			break;
		default:
			System.out.println("Incorrect option");
				
		}
		
		
	}
}

