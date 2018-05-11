package Algoritma;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        int max=0;
        
       
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
            if(ar[ar_i]>max){
                max=ar[ar_i];
            }
            }
        int result=0;
        for(int ar_i=0; ar_i<n;ar_i++){
           
            if(ar[ar_i]==max){
                result++;
            }
        }
        
        
        
               
        System.out.println(result);
	}

}
