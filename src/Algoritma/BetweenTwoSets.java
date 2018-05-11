package Algoritma;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int[] a = new int[n];
	        int[] b = new int[m];
	        int count=0;
	       
	         for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	       
	        for(int b_i=0; b_i < m; b_i++){
	            b[b_i] = in.nextInt();
	        }
	     
	        int result=0;
	        int result2=0;
	        for(int c_i=a[a.length-1]; c_i<=b[0]; c_i++){
	            for(int d_i=0;d_i<=a.length-1;d_i++){
	                result=result+(c_i%a[d_i]);
	            }
	            if (result==0){
	                for(int e_i=0;e_i<=b.length-1;e_i++){
	                 result2=result2+(b[e_i]%c_i);   
	                } if (result2==0) {
	                    count++;
	                } 
	                result2=0;
	            }
	           result=0;
	        }
	       System.out.print(count);
	}

}
