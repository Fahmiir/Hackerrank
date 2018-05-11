package Algoritma;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        long[] arr = new long[5];
	        long[] array = new long[5];
	        
	        long dec=0;
	        int arr_j=0;
	        for(int arr_i = 0; arr_i < 5; arr_i++){
	            arr[arr_i] = in.nextLong();
	        }
	        
	        for(int arr_k=0;arr_k<5;arr_k++) {
	            long sum=0;
	        for( arr_j=0;arr_j<5;arr_j++){
	        sum=sum+arr[arr_j];    
	        }
	        dec=sum-arr[arr_k];
	        array[arr_k]=dec;
	         
	        }    
	        Arrays.sort(array);
	        System.out.print(array[0]+" "+array[array.length-1]);
	    
	}

}
