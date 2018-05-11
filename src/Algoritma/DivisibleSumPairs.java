package Algoritma;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        int result=0;
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        
        for(int br_i=0; br_i<n-1 ; br_i++){
            for(int cr_i=br_i+1; cr_i<n; cr_i++){
                int sum= ar[br_i]+ar[cr_i];
                if (sum%k==0){
                    result++;
                }
            }
        }
        System.out.println(result);
	}

}
