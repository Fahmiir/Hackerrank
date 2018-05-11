package Algoritma;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class AppleAndOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int t = in.nextInt();
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int m = in.nextInt();
	        int n = in.nextInt();
	        int d =0;
	        
	        int apel=0;
	        int jeruk=0;
	        int[] apple = new int[m];
	        if(a<b && s<t) {
	        for(int apple_i=0; apple_i < m; apple_i++){
	            apple[apple_i] = in.nextInt();
	            d = a+apple[apple_i];
	            if (d>=s && d<=t) {
	                apel++;
	            }
	        }
	        int[] orange = new int[n];
	        for(int orange_i=0; orange_i < n; orange_i++){
	            orange[orange_i] = in.nextInt();
	            d=b+orange[orange_i];
	            if (d>=s && d<=t){
	                jeruk++;
	            }
	        }
	        }
	        System.out.println(apel);
	        System.out.println(jeruk);
	}

}
