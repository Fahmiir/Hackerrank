package Algoritma;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayOfTheProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int year = in.nextInt();
	        String result = "";
	        String date = "";
	       if(year>=1700 &&  year<=1917){
	           if (year%4==0){
	               result="12.09.";
	           } else {
	               result="13.09.";
	           }
	       }
	           if(year>1918 && year<=2700){
	           if ((year%4==0 && year%100!=0) || (year%400==0)){
	               result="12.09.";
	           } else {
	               result="13.09.";
	           }
	           }
	               if(year==1918){
	                   result="26.09.";
	               }
	       
	        System.out.println(result+year);
	}

}
