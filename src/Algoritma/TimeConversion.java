package Algoritma;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        String[] time = sc.nextLine().split(":");
	        
	        String hours = time[0];
	        String minutes = time[1];
	        String seconds = time[2].substring(0,2);
	        String dayEve = time[2].substring(2,4);
	        if(dayEve.equals("AM")){
	            System.out.println((hours.equals("12")?"00":hours) +":"+minutes+":"+seconds);
	        }else{
	            System.out.println((hours.equals("12")?hours:(Integer.parseInt(hours)+12))+":"+minutes+":"+seconds);
	        }
	}

}
