import java.util.Scanner;

public class Prime {
	public  void Number() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		 
		int num = scan.nextInt();
		//scan.close();
		
       int count = 0;
       
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=10;j++) {
	    if(num%i==0) {
	    count++;
	     }
		}	
       }
		if(count==2) {
			
			System.out.println("its prime number");
		}
		else {
			System.out.println("not prime number");
		}
		}	
	public static void main(String[] args) {
		
		Prime n = new Prime();
		
		n.Number();
		}
	}


