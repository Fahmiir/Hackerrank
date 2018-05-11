package Algoritma;
import java.util.*;

public class SimpleArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int sum=0;
	        for(int i=0;i<n;i++)
	        {
	         sum = sum+in.nextInt();   
	        }   
	        System.out.println(sum);
	}

}
