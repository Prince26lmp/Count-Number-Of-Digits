package JavaDSA;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Number:");
	    int num= sc.nextInt();
	    int count=0;
	    int org_num=num;
	    while(num!=0)
	    {
	        num=num/10;
	    	count++;
	    }
	    
System.out.println("Number Of Digits In A Number "+org_num+" Is " +count);
	}

}
