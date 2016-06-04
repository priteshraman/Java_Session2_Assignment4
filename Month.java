import java.util.Scanner;
class Month{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter month's number: ");
            int m;
            m = sc.nextInt();
			switch(m){
				case(1):
				System.out.println("month is january");
				System.out.println("it has 31 days");
				break;
				case(2):
				System.out.println("month is february");
				System.out.println("it has 28 days generally whereas in leap year it has 29 days");
				break;
				case(3):
				System.out.println("month is March");
				System.out.println("it has 31 days");
				break;
				case(4):
				System.out.println("month is April");
				System.out.println("it has 30 days");
				break;
				case(5):
				System.out.println("month is May");
				System.out.println("it has 31 days");
				break;
				case(6):
				System.out.println("month is june");
				System.out.println("it has 30 days");
				break;
				case(7):
				System.out.println("month is july");
				System.out.println("it has 31 days");
				break;
				case(8):
				System.out.println("month is August");
				System.out.println("it has 31 days");
				break;
				case(9):
				System.out.println("month is September");
				System.out.println("it has 30 days");
				break;
				case(10):
				System.out.println("month is October");
				System.out.println("it has 31 days");
				break;
				case(11):
				System.out.println("month is November");
				System.out.println("it has 30 days");
				break;
				case(12):
				System.out.println("month is December");
				System.out.println("it has 31 days");
				break;
				default:
				System.out.println("please enter month's number between 1 and 12 only");
				
				
			}
		
	}
}