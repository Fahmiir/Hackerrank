
package Algoritma;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum1=0;
        int sum2=0;
        int sum=0;
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i==a_j) {
                    sum1=sum1+a[a_i][a_j];
                }
                if(a_j==n-a_i-1)
                    sum2=sum2+a[a_i][a_j];
        }       
            }
        sum=sum1-sum2;
        System.out.println(Math.abs(sum));
	}

}
