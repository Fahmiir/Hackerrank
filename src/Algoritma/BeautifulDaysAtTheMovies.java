package Algoritma;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulDaysAtTheMovies {
	  static int beautifulDays(int i, int j, int k) {
		    int count=0;
		    for(int a=i;a<=j;a++){
		      if((Math.abs(a-reverse(a))%k)==0){
		       count++   ;     
		      }     
		    }
		    return count;
		    }

		    static int reverse(int l){
		    String s = String.valueOf(l);
		    StringBuffer sb= new StringBuffer(s);       
		    String reverse = sb.reverse().toString();

		    return Integer.valueOf(reverse);
		    }

		    private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] ijk = scanner.nextLine().split(" ");

	        int i = Integer.parseInt(ijk[0]);

	        int j = Integer.parseInt(ijk[1]);

	        int k = Integer.parseInt(ijk[2]);

	        int result = beautifulDays(i, j, k);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	}

}
