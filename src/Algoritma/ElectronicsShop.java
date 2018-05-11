package Algoritma;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ElectronicsShop {
	 static int getMoneySpent(int[] keyboards, int[] drives, int s){
	        int temp=-1;
	        int result=0;
	        int hasil=0;
	        
	        for(int i=0;i<keyboards.length;i++){
	            for(int j=0;j<drives.length;j++){
	                result = keyboards[i]+drives[j];
	                if(result<=s){
	                    if(result>temp){
	                        temp=result;
	                        hasil=temp;
	                    }
	                } else if (result>s){
	                  if(temp==-1){
	                      hasil=-1;
	                  }else {
	                      hasil=temp;
	                  }            
	                }
	                
	            }
	        }
        return hasil;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int[] keyboards = new int[n];
	        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
	            keyboards[keyboards_i] = in.nextInt();
	        }
	        int[] drives = new int[m];
	        for(int drives_i=0; drives_i < m; drives_i++){
	            drives[drives_i] = in.nextInt();
	        }
	        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
	        int moneySpent = getMoneySpent(keyboards, drives, s);
	        System.out.println(moneySpent);
	    }
	}

}
