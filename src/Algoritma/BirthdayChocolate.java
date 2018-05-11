package Algoritma;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayChocolate {

	public static void main(String[] args) {

		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] s = new int[n];
	        for(int s_i=0; s_i < n; s_i++){
	            s[s_i] = in.nextInt();
	        }
	        int d = in.nextInt();
	        int m = in.nextInt();
	        int result=0;
	        
	        
	        for(int t_i=0; t_i<=n-m;t_i++){
	            int sum=0;
	            for(int r_i=t_i;r_i<t_i+m;r_i++){
	                sum=sum+s[r_i];    
	             }
	           
	            if (sum==d){
	                result++;
	            }
	        }
	        
	        
	        System.out.println(result);
	}

}
