package Algoritma;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTheTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       int [] a = new int[3];
	       int [] b = new int[3];
	       for (int i=0;i<=2;i++){
	           a[i]=sc.nextInt();
	       }
	        for (int i=0;i<=2;i++){
	           b[i]=sc.nextInt();
	       }
	        int c =0;
	        int d =0;
	        for(int i=0;i<=2;i++){
	           if (a[i]>b[i]){
	               c++;
	           } 
	            if (b[i]>a[i]){
	                d++;
	            }
	        }
	        System.out.print(c+" "+d);
	}

}
