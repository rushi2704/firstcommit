import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

	
		int num = 156;
		int rem;
		int arm =0;
		int temp ;
		temp=num;

		while(num>0){
		rem=num%10;
		arm=(rem*rem*rem)+arm;
		num=num/10;


		}
		if(temp==arm){
		System.out.print("amstrong");
		}else{
		System.out.print("not amstrong");


			}

}}
