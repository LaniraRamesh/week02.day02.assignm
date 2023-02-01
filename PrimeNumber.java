package week02.day02;

public class PrimeNumber {

	public static void main(String[] args) {
		int input =13;
		boolean flag=true;

		for(int i=1;i<=input/1;i++) {
		
			if (input%i==0) {
	
				 flag=false;
				
			}
			}
			if(flag=true) {
				System.out.println(" 13 is a prime number");
				
			}else {
				System.out.println("13 is not a prime number");
			}
		

	}

}
