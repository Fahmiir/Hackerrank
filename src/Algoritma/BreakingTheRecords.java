package Algoritma;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingTheRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] s = new int[n];
	        int count=0;
	        int count2=0;
	        int temp=0;
	        int temp2=0;
	        for(int s_i=0; s_i < n; s_i++){
	            s[s_i] = in.nextInt();
	        }
	        temp=s[0];
	        for(int r_i=1; r_i<=s.length-1; r_i++){
	           
	            if (temp<s[r_i]){
	                count2++;
	            temp=s[r_i]; 
	            }
	           
	        }
	        temp2=s[0];
	        for(int t_i=1; t_i<=s.length-1; t_i++){
	             
	            if (temp2>s[t_i]){
	                count++;
	                temp2=s[t_i];
	            }
	        }
	        
	        System.out.print(count2+" "+count);
	}

}
