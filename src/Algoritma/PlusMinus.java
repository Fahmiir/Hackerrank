package Algoritma;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int plus=0;
        int minus=0;
        int zero=0;
        
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0){
                plus++;
            }  else if(arr[arr_i]<0){
                minus++;
            } else{
                zero++;
            }
            
        }
       float positiveCount=(float)plus/n;
        float negativeCount=(float)minus/n;
        float zeroCount=(float)zero/n;
        System.out.println(positiveCount);
        System.out.println(negativeCount);
        System.out.println(zeroCount);
	}

}
