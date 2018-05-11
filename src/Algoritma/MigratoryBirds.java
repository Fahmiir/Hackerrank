package Algoritma;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner in = new Scanner(System.in);
        int result=0;
        int n = in.nextInt();
        int a =0;
        int b =0;
        int c=0;
        int d=0;
        int e=0;
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        for(int br_i = 0; br_i < ar.length; br_i++){
            int temp = ar[br_i];
            switch(temp) {
                case 1 :
                    a++;
                    break;
                case 2 :
                    b++;
                    break;
                case 3 :
                    c++;
                    break;
                case 4 :
                    d++;
                    break;
                case 5 :
                    e++;
                    break;
            }
        }
        
        int [] cr = {a,b,c,d,e}; 
        int yemp=cr[0];
        for (int cr_i=1;cr_i<=4;cr_i++){
        
            if (yemp<cr[cr_i]){
                yemp=cr[cr_i];
            }
        }
    if (yemp==a){
        result=1;
    } else if (yemp==b){
        result=2;
    } else if (yemp==c){
        result=3;
    } else if (yemp==d){
        result=4;
    } else if (yemp==e){
        result=5;
    } 
         System.out.println(result);
	}

}
